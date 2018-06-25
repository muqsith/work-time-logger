package com.wtl.service.test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

import com.wtl.service.Settings;
import com.wtl.service.impl.SettingsImpl;

public class Service {
	
	private Settings settings = new SettingsImpl();
	
	@Test
	public void testSetSettings() {
		assertEquals(true, true);
	}
	
	public void testGetSetting() {
		
	}
	
	public void testGetAllSettings() {
		
	}
	
	public void testLoadDefaultSettings() throws IOException {
		
		settings.loadDefaultSettings();
		assertTrue(true);
	}
}
