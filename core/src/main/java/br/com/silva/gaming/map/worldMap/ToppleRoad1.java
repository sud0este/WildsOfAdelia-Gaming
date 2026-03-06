package br.com.silva.gaming.map.worldMap;

import com.badlogic.gdx.math.Vector2;
import br.com.silva.gaming.audio.AudioObserver;
import br.com.silva.gaming.component.Component;
import br.com.silva.gaming.entities.Entity;
import br.com.silva.gaming.entities.EntityConfig;
import br.com.silva.gaming.entities.EntityFactory;
import br.com.silva.gaming.map.Map;
import br.com.silva.gaming.map.MapFactory;
import br.com.silva.gaming.profile.ProfileManager;

import static br.com.silva.gaming.audio.AudioObserver.AudioTypeEvent.TEST_THEME;

public class ToppleRoad1 extends Map {

    private static String mapPath = "asset/map/Topple_Road_1.tmx";

    public ToppleRoad1() {
        super(MapFactory.MapType.TOPPLE_ROAD_1, mapPath);

        //Special cases
        Entity rabite = EntityFactory.getInstance().getEntityByName(EntityFactory.EntityName.RABITE);
        initSpecialEntityPosition(rabite);
        mapEntities.add(rabite);

        Entity rabite2 = EntityFactory.getInstance().getEntityByName(EntityFactory.EntityName.RABITE2);
        initSpecialEntityPosition(rabite2);
        mapEntities.add(rabite2);

    }

    @Override
    public AudioObserver.AudioTypeEvent getMusicTheme() {
        return TEST_THEME;
    }

    @Override
    public void unloadMusic() {
        notify(AudioObserver.AudioCommand.MUSIC_STOP, getMusicTheme());
    }

    @Override
    public void loadMusic() {
        notify(AudioObserver.AudioCommand.MUSIC_LOAD, getMusicTheme());
        notify(AudioObserver.AudioCommand.MUSIC_PLAY_LOOP, getMusicTheme());
    }

    private void initSpecialEntityPosition(Entity entity) {
        Vector2 position = new Vector2(0,0);

        if (enemyStartPositions.containsKey(entity.getEntityConfig().getEntityID())) {
            position = enemyStartPositions.get(entity.getEntityConfig().getEntityID());
        }
        entity.sendMessage(Component.MESSAGE.INIT_START_POSITION, json.toJson(position));

        //Overwrite default if special config is found
        EntityConfig entityConfig = ProfileManager.getInstance().getProperty(entity.getEntityConfig().getEntityID(), EntityConfig.class);
        if (entityConfig != null ) {
            entity.setEntityConfig(entityConfig);
        }
    }
}
