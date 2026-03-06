package br.com.silva.gaming.battle;

import com.badlogic.gdx.utils.Array;
import br.com.silva.gaming.entities.Entity;
import br.com.silva.gaming.inventory.InventoryObserver;

public class BattleSubject {
    private Array<BattleObserver> observers;

    public BattleSubject() {
        observers = new Array<>();
    }

    public void addObserver(BattleObserver battleObserver) {
        observers.add(battleObserver);
    }

    public void removeObserver(BattleObserver battleObserver) {
        observers.removeValue(battleObserver, true);
    }

    protected void notify(final Entity entity, BattleObserver.BattleEvent event) {
        for(BattleObserver observer: observers) {
            observer.onNotify(entity, event);
        }
    }

    protected void notify(final String drop, InventoryObserver.InventoryEvent event) {
        for(BattleObserver observer: observers) {
            observer.onNotify(drop, event);
        }
    }
}
