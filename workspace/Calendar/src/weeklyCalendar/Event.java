package weeklyCalendar;

import java.time.LocalTime;
import java.util.Date;

public class Event {
	Day eventDay;
	String eventTitle;
	LocalTime startTime;
	String description;
	long duration;
	
	
	public Event(String eventTitle, Day eventDay, LocalTime startTime, String description, long duration) {
		this.eventTitle = eventTitle;
		this.eventDay = eventDay;
		this.startTime = startTime;
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
        return "Event{" +
                "eventDay=" + eventDay +
                ", eventTitle='" + eventTitle + '\'' +
                ", startTime=" + startTime +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                '}';
    }
}
