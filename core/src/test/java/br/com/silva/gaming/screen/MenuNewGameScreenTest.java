package br.com.silva.gaming.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import br.com.silva.gaming.GdxGame;
import br.com.silva.gaming.GdxRunner;
import br.com.silva.gaming.manager.ResourceManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedConstruction;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockConstruction;

@ExtendWith(GdxRunner.class)
public class MenuNewGameScreenTest {

    private MockedConstruction<Stage> mockStage;

    @BeforeEach
    void init() {
        Gdx.gl = mock(GL20.class);
        Gdx.gl20 = mock(GL20.class);
        mockStage = mockConstruction(Stage.class);
    }

    @AfterEach
    void end() {
        mockStage.close();
    }

    @Test
    void screen_instance() {
        GdxGame gdxGame = mock(GdxGame.class);
        BaseScreen baseScreen = mock(BaseScreen.class);
        ResourceManager resourceManager = new ResourceManager();
        MenuNewGameScreen screen = new MenuNewGameScreen(gdxGame, baseScreen, resourceManager);

        assertNotNull(screen);
    }
}
