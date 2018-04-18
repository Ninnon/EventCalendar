package weeklyCalendar;

import java.time.LocalTime;
import java.util.Date;
// This class now implements Comparable so we can sort the array according to the time of day. 
public class Event implements Comparable <Event>{
	Day eventDay;
	String eventTitle;
	LocalTime startTime;
	String description;
	long duration;
	
	
	public Event(String eventTitle, Day eventDay, LocalTime startTime, String description, long duration) {
		this.eventTitle = eventTitle;
		this.eventDay = eventDay;
		this.startTime  = startTime;
		this.description = description;
		this.duration = duration;
	}

	public Day getEventDay() {
		return eventDay; }
	public String getEventTitle() {
		return eventTitle;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public String getDescription() {
		return description;
	}
    public long getDuration() {
        return duration;
    }

    public void setEventDay(Day eventDay) { this.eventDay = eventDay; }
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
//        return "Event{" +
//                "eventDay=" + eventDay +
//                ", eventTitle='" + eventTitle + '\'' +
//                ", startTime=" + startTime +
//                ", description='" + description + '\'' +
//                ", duration=" + duration +
//                '}';
    	
    	return " " + startTime + ":   " + eventTitle;
    	// Should we narrow it down to just startTime and eventTitle? It would be cleaner and be a simple calendar.
    	// If we want to kep the other things as well, I am totally fine with that too.
    }

	@Override
	public int compareTo(Event o) {
		LocalTime time = o.getStartTime();
		return startTime.compareTo(time);
	}
}
