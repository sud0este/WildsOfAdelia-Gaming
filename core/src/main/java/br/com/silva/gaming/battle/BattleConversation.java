package br.com.silva.gaming.battle;

import com.badlogic.gdx.utils.Json;
import br.com.silva.gaming.component.ComponentObserver;
import br.com.silva.gaming.component.ComponentSubject;
import br.com.silva.gaming.entities.Entity;

public class BattleConversation extends ComponentSubject {

    private Json json;

    public BattleConversation() {
        json = new Json();
    }

    public void notifBattleResume(Entity entity) {
        notify(json.toJson(entity.getEntityConfig()), ComponentObserver.ComponentEvent.LOAD_RESUME);
        notify(json.toJson(entity.getEntityConfig()), ComponentObserver.ComponentEvent.SHOW_RESUME);
    }
}
