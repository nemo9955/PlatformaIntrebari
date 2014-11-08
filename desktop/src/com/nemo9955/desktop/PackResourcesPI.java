package com.nemo9955.desktop;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;

public class PackResourcesPI {

	public static void main( String[] args ) {

		Settings param = new Settings();
		param.duplicatePadding = true;
		param.pot = false;
		param.flattenPaths = true;
		param.limitMemory = false;
		param.edgePadding = true;

		TexturePacker.process(param, "/home/nemo9955/CodeStation/PI materials/menu",
					"/home/nemo9955/CodeStation/proiecteJava/PlatformaIntrebari/android/assets", "menu");
	}

}
