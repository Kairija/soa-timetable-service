package org.denevell.tomcat.entities.write;

import java.util.ArrayList;

//@Entity
public class Timetable {
	private Timeprofile timeprofile = new Timeprofile();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private String name;
	//@Id @GeneratedValue
	private String id;
	
	
	/**
	 * @return the timeprofile
	 */
	public Timeprofile getTimeprofile() {
		return timeprofile;
	}
	/**
	 * @param timeprofile the timeprofile to set
	 */
	public void setTimeprofile(Timeprofile timeprofile) {
		this.timeprofile = timeprofile;
	}
	/**
	 * @return the courses
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}
	/**
	 * @param courses the courses to set
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
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
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

}
