package com.wtl;

import java.util.Date;

public interface TimeLogger {
	void login();
	void logout();
	void updateLogin(Date day, String workLogId);
	void updateLogout(Date day, String workLogId);
}
