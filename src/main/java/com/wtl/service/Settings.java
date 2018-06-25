package com.wtl.service;

import java.io.IOException;

public interface Settings {
	void setSettings();
	String getSetting(String name);
	Settings getAllSettings();
	/**
	 * This method will load default settings under src/main/resources into SQLite database
	 */
	void loadDefaultSettings() throws IOException;
}
