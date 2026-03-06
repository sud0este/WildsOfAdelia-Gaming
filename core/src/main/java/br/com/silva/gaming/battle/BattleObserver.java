package br.com.silva.gaming.battle;

import br.com.silva.gaming.entities.Entity;
import br.com.silva.gaming.inventory.InventoryObserver.InventoryEvent;

public interface BattleObserver {
    enum BattleEvent {
        OPPONENT_ADDED,
        OPPONENT_HIT_DAMAGE,
        OPPONENT_DEFEATED,
        OPPONENT_TURN_DONE,
        PLAYER_ADDED,
        PLAYER_HIT_DAMAGE,
        PLAYER_RUNNING,
        PLAYER_TURN_DONE,
        PLAYER_TURN_START,
        PLAYER_PHASE_START,
        PLAYER_USED_MAGIC,
        RESUME_OVER,
        NONE
    }

    void onNotify(final Entity enemyEntity, BattleEvent event);

    void onNotify(final String drop, InventoryEvent event);
}
