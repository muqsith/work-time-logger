package com.wtl;

import com.wtl.service.Report;
import com.wtl.service.TimeLogger;

/**
 * Facade of "Work time logger" library
 * @author muqsith
 *
 */
public class WorkTimeLogger {
	
	/**
	 * This function does following if already not done
	 * 	 i. Initializes database
	 *  ii. Imports default settings
	 * @author muqsith
	 */
	public static void init() {
		
	}
	
	public static TimeLogger getTimeLogger() {
		return null;
	}
	
	public static Report getReport() {
		return null;
	}
}