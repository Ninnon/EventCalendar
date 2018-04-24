package weeklyCalendar;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
// This class now implements Comparable so we can sort the array according to the time of day. 
public class Event implements Comparable <Event>{
	Day eventDay;
	String eventTitle;
	LocalTime startTime;
	
	
	public Event(String eventTitle, Day eventDay, LocalTime startTime) {
		this.eventTitle = eventTitle;
		this.eventDay = eventDay;
		this.startTime  = startTime;
	}

	public Day getEventDay() {
		return eventDay; }
	public String getEventTitle() {
		return eventTitle;
	}
	public LocalTime getStartTime() {
		
		return startTime;
		
	}

	
   

    public void setEventDay(Day eventDay) { this.eventDay = eventDay; }
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	
   

    // Used to format string to be written to csv file
    public String toFileLine() {
	    return String.format("%s,%s,%s", eventTitle, eventDay, startTime.toString());
    }

    @Override
    public String toString() {
    	return " " + startTime + ":   " + eventTitle;
    }

	@Override
	public int compareTo(Event o) {
		LocalTime time = o.getStartTime();
		return startTime.compareTo(time);
	}
}
