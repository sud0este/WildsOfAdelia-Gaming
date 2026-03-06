package br.com.silva.gaming;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import br.com.silva.gaming.manager.PreferenceManager;
import br.com.silva.gaming.manager.ResourceManager;
import br.com.silva.gaming.screen.CharacterSelectionScreen;
import br.com.silva.gaming.screen.GameScreen;
import br.com.silva.gaming.screen.MenuScreen;

public class GdxGame extends Game {
	private SpriteBatch batch;
	private ResourceManager resourceManager;
	private PreferenceManager preferenceManager = new PreferenceManager();
	private MenuScreen menuScreen;
	private CharacterSelectionScreen characterSelectionScreen;
	private GameScreen gameScreen;

	public SpriteBatch getBatch() {
		return batch;
	}

	public MenuScreen getMenuScreen() {
		return menuScreen;
	}

	public CharacterSelectionScreen getCharacterSelectionScreen() {
		return characterSelectionScreen;
	}

	public GameScreen getGameScreen() {
		return gameScreen;
	}

	public void setGameScreen(GameScreen gameScreen) {
		this.gameScreen = gameScreen;
	}

	public PreferenceManager getPreferenceManager() {
		return preferenceManager;
	}

	public void create() {
		batch = new SpriteBatch();
		resourceManager = new ResourceManager();

		menuScreen = new MenuScreen(this, resourceManager);
		characterSelectionScreen = new CharacterSelectionScreen(this, resourceManager);

		this.setScreen(menuScreen);
	}

	@Override
	public void dispose() {
		super.dispose();
		batch.dispose();
		menuScreen.dispose();
		characterSelectionScreen.dispose();
		gameScreen.dispose();
		resourceManager.dispose();
	}
}
