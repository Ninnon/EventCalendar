package weeklyCalendar;

import java.util.Date;

public class Event {
	Day eventDay;
	String eventTitle;
	Date startTime;
	String description;
	
	
	public Event(String eventTitle, Date startTime, String description) {
		this.eventTitle = eventTitle;
		this.startTime = startTime;
		this.description = description;
	}

	public Day getEventDay() {
		return eventDay; }
	public String getEventTitle() {
		return eventTitle;
	}
	public Date getStartTime() {
		return startTime;
	}
	public String getDescription() {
		return description;
	}

	public void setEventDay(Day eventDay) { this.eventDay = eventDay; }
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
