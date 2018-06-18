package com.wtl.service;

public interface Settings {
	void setSettings();
	String getSetting(String name);
	Settings getAllSettings();
	void loadSettings();
}
