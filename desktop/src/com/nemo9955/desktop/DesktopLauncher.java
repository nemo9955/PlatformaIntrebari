package com.nemo9955.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nemo9955.PlatformaIntrebari;

public class DesktopLauncher {

	public static void main( String[] arg ) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Platforma intrebari";
		config.x = 2300;
		new LwjglApplication(new PlatformaIntrebari(), config);
	}
}
