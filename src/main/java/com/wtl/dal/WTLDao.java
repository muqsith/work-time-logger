package com.wtl.dal;

import java.util.Date;
import java.util.List;

import com.wtl.dto.Day;
import com.wtl.dto.Settings;

public interface WTLDao {
	void loadDatabase();
	void saveDatabase();
	Day getDay(Date day);
	Day getDay(String id);
	List<Day> getDays(Date from, Date till);
	Settings getSettings();
	void addSetting(String name, String value, String description);
	void addWorkLog(String dayId, String eventType, String timeStamp);
}
