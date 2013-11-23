package org.denevell.tomcat.entities.write;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hour {
	private Date starttime;
	private Date endtime;
	
	
	/**
	 * @return the starttime
	 */
	public Date getStarttime() {
		return starttime;
	}
	/**
	 * @param starttime the starttime to set
	 */
	public void setStarttime(String starttime) {
		SimpleDateFormat df = new SimpleDateFormat("HH:mm"); 
		try {
			this.starttime = df.parse(starttime);
		} catch (ParseException e) {
			System.out.println("Falsches Zeitformat.");
			e.printStackTrace();
		}
	}
	/**
	 * @return the endtime
	 */
	public Date getEndtime() {
		return endtime;
	}
	/**
	 * @param endtime the endtime to set
	 */
	public void setEndtime(String endtime) {
		SimpleDateFormat df = new SimpleDateFormat("HH:mm"); 
		try {
			this.endtime = df.parse(endtime);
		} catch (ParseException e) {
			System.out.println("Falsches Zeitformat.");
			e.printStackTrace();
		}		
	}
	
	
}
