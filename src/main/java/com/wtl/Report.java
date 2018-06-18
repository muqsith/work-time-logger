package com.wtl;

import java.util.Date;

import com.wtl.dto.DayReport;
import com.wtl.dto.GridReport;
import com.wtl.dto.SummaryReport;

/**
 * 
 * @author muqsith
 *
 */
public interface Report {
	/**
	 * 
	 * @param month (1-Jan, 2-Feb ... 12-Dec)
	 * @return
	 */
	SummaryReport getSummary(int month);
	/**
	 * 
	 * @param month (1-Jan, 2-Feb ... 12-Dec)
	 * @return
	 */
	GridReport getGrid(int month);
	/**
	 * 
	 * @param day
	 * @return
	 */
	DayReport getDay(Date day);
}
