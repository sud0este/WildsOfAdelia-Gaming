package br.com.silva.gaming.quest;

import br.com.silva.gaming.map.MapManager;

public interface QuestTaskHandler {

    void handleUpdate(QuestTask questTask, String questID);

    void handleInit(MapManager mapManager, QuestTask questTask, String questID);

}
