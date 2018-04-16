package weeklyCalendar;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class ListItems {
	
	// Method parse out a line
    public static Event getEvent(String line) {
        Day day;
        String title;
        LocalTime start;
        String description;
        long duration;

        String[] temp = line.split(",");

        title = temp[0];
        day = Day.parseDay(temp[1]);
        start = LocalTime.parse(temp[2]);
        description = temp[3];
        duration = Integer.parseInt(temp[4]);

        return new Event(title, day, start, description, duration);
    }
	
	//Use array list for each day 

}
