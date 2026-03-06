package br.com.silva.gaming.entities.npc.enemy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Json;
import br.com.silva.gaming.GdxRunner;
import br.com.silva.gaming.component.Component;
import br.com.silva.gaming.entities.Entity;
import br.com.silva.gaming.entities.EntityFactory;
import br.com.silva.gaming.map.Map;
import br.com.silva.gaming.map.MapFactory;
import br.com.silva.gaming.map.MapManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedConstruction;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockConstruction;

@ExtendWith(GdxRunner.class)
public class EnemyPhysicsComponentTest {

    private MockedConstruction<SpriteBatch> mockSpriteBatch;
    private MockedConstruction<ShapeRenderer> mockShapeRenderer;

    @BeforeEach
    void init() {
        Gdx.gl = mock(GL20.class);
        Gdx.gl20 = mock(GL20.class);
        mockSpriteBatch = mockConstruction(SpriteBatch.class);
        mockShapeRenderer = mockConstruction(ShapeRenderer.class);
    }

    @AfterEach
    void end() {
        mockSpriteBatch.close();
        mockShapeRenderer.close();
    }

    @Test
    public void should_follow_player_when_close_enough() {
        Json json = new Json();
        Entity player = EntityFactory.getInstance().getEntity(EntityFactory.EntityType.WARRIOR);
        MapManager mapManager = new MapManager();
        mapManager.setCamera(new OrthographicCamera());
        mapManager.setPlayer(player);
        mapManager.loadMap(MapFactory.MapType.TOPPLE_ROAD_1);
        OrthogonalTiledMapRenderer mapRenderer = new OrthogonalTiledMapRenderer(mapManager.getCurrentTiledMap(), Map.UNIT_SCALE);
        Entity enemy = mapManager.getCurrentMapEntities().get(1);

        Vector2 currentEntityPosition = new Vector2(13,14);
        player.sendMessage(Component.MESSAGE.INIT_START_POSITION, json.toJson(currentEntityPosition));
        player.update(mapManager, mapRenderer.getBatch(), 1.0f);

        float dy = player.getCurrentPosition().y - enemy.getCurrentPosition().y;

        enemy.update(mapManager, mapRenderer.getBatch(), 1.0f);

        float dy2 = player.getCurrentPosition().y - enemy.getCurrentPosition().y;
        assertTrue(Math.abs(dy2) < Math.abs(dy));
    }
}
