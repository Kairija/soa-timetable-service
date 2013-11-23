package org.denevell.tomcat.entities.write;

import java.util.ArrayList;

public class Course {
	private Hour time = new Hour();
	private String id;
	private String name, shortname;
	private String teacher;
	private String desciption;
	private String room;
	private ArrayList<Comment> comments = new ArrayList<Comment>();
	
	
	/**
	 * @return the time
	 */
	public Hour getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Hour time) {
		this.time = time;
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
	 * @return the shortname
	 */
	public String getShortname() {
		return shortname;
	}
	/**
	 * @param shortname the shortname to set
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	/**
	 * @return the teacher
	 */
	public String getTeacher() {
		return teacher;
	}
	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	/**
	 * @return the desciption
	 */
	public String getDesciption() {
		return desciption;
	}
	/**
	 * @param desciption the desciption to set
	 */
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	/**
	 * @return the room
	 */
	public String getRoom() {
		return room;
	}
	/**
	 * @param room the room to set
	 */
	public void setRoom(String room) {
		this.room = room;
	}
	/**
	 * @return the comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
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
