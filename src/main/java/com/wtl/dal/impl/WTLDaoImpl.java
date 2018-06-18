package com.wtl.dal.impl;

import java.util.Date;
import java.util.List;

import com.wtl.dal.WTLDao;
import com.wtl.dto.Day;
import com.wtl.dto.Settings;

public class WTLDaoImpl implements WTLDao {

	@Override
	public void loadDatabase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveDatabase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Day getDay(Date day) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Day getDay(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Day> getDays(Date from, Date till) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Settings getSettings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSetting(String name, String value, String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addWorkLog(String dayId, String eventType, String timeStamp) {
		// TODO Auto-generated method stub
		
	}

}
