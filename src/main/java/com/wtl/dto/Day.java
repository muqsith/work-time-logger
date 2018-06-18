package com.wtl.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Day {
	private List<Date> login = new ArrayList<Date>(10);
	private List<Date> logout = new ArrayList<Date>(10);
	private Date day;
	
	public List<Date> getLogin() {
		return login;
	}
	public void setLogin(List<Date> login) {
		this.login = login;
	}
	public List<Date> getLogout() {
		return logout;
	}
	public void setLogout(List<Date> logout) {
		this.logout = logout;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
}
