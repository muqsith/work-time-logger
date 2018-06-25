package com.wtl.service.impl;

import java.io.IOException;
import java.util.Properties;

import com.wtl.service.Settings;

public class SettingsImpl implements Settings {

	@Override
	public void setSettings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSetting(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Settings getAllSettings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadDefaultSettings() throws IOException {
		Properties props = new Properties();
		props.load(SettingsImpl.class.getResourceAsStream("settings.properties"));
		System.out.println(props.getProperty("com.wtl.dailyWorkDuration"));
	}

}
