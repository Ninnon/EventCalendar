package weeklyCalendar;

import java.util.Date;

public class Events {
	String eventTitle;
	Date startTime;
	String description;
	
	
	public Events(String eventTitle, Date startTime, String description) {
		this.eventTitle = eventTitle;
		this.startTime = startTime;
		this.description = description;
	}


	public String getEventTitle() {
		return eventTitle;
	}


	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
