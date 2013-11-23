package org.denevell.tomcat.entities.write;

import java.util.ArrayList;

public class Timeprofile {
	private int numberOfWeekdays = 5;
	private ArrayList<Hour> hours = new ArrayList<Hour>();
	private String name;
	
	/**
	 * @return the numberOfWeekdays
	 */
	public int getNumberOfWeekdays() {
		return numberOfWeekdays;
	}
	/**
	 * @param numberOfWeekdays the numberOfWeekdays to set
	 */
	public void setNumberOfWeekdays(int numberOfWeekdays) {
		this.numberOfWeekdays = numberOfWeekdays;
	}
	/**
	 * @return the hours
	 */
	public ArrayList<Hour> getHours() {
		return hours;
	}
	/**
	 * @param hours the hours to set
	 */
	public void setHours(ArrayList<Hour> hours) {
		this.hours = hours;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
