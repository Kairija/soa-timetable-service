package org.denevell.tomcat.entities.write;

import java.util.ArrayList;
import java.util.HashMap;

public class TimetableManager {
	
	//name should be an id
	public Timetable getTimetable(String name){
		Timetable tt = new Timetable();
		
		return tt;
	}
	
	public HashMap<String, String> getAllTimetableNames(){
		//id - name
		HashMap<String, String> ttlist = new HashMap<String, String>();
		
		return ttlist;
	}
	
	public void setTimetableCourse(String timetablename, Course course){
		
	}
	
	public void addCourse(String id, String name, String shortname, String room, String teacher, String description, String starttime, String endtime){
		
	}
	
	public ArrayList<Course> getCoursesForTimetable(String timetableid){
		ArrayList<Course> courses = new ArrayList<Course>();
		
		return courses;
	}
	
	public void setTimetableTimeprofile(String timetablename, Timeprofile tprofile){
		
	}
	//String starttime - String endtime
	public void addTimeprofile(String numberOfWeekdays, HashMap<String, String> coursetimes){
		
	}
	public ArrayList<String> getAllTimeprofileNames(){
		ArrayList<String> tpn = new ArrayList<String>();
		
		return tpn;
	}
	
	public ArrayList<String> getAllCourseNames(){
		ArrayList<String> cn = new ArrayList<String>();
		
		return cn;
	}
}
