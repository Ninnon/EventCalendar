package weeklyCalendar;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {

    //Use array list for each day
    List<Event> sunday = new ArrayList<>(Arrays.asList());
    List<Event> monday = new ArrayList<>(Arrays.asList());
    List<Event> tuesday = new ArrayList<>(Arrays.asList());
    List<Event> wednesday = new ArrayList<>(Arrays.asList());
    List<Event> thursday = new ArrayList<>(Arrays.asList());
    List<Event> friday = new ArrayList<>(Arrays.asList());
    List<Event> saturday = new ArrayList<>(Arrays.asList());

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
	


}
