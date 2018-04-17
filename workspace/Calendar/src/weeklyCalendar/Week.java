package weeklyCalendar;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Week {

    //Use array list for each day
    List<Event> sunday = new ArrayList<>(Arrays.asList());
    List<Event> monday = new ArrayList<>(Arrays.asList());
    List<Event> tuesday = new ArrayList<>(Arrays.asList());
    List<Event> wednesday = new ArrayList<>(Arrays.asList());
    List<Event> thursday = new ArrayList<>(Arrays.asList());
    List<Event> friday = new ArrayList<>(Arrays.asList());
    List<Event> saturday = new ArrayList<>(Arrays.asList());

    // Constructor

    // Read the file
        // Also put the lines that are read into the right Day list using a switch statement
    public void readFile() {
        String readLine = "";
        Event tempEvent;
        try(Scanner reader = new Scanner(GuiApp.class.getResourceAsStream("week.csv"))){
            while (reader.hasNextLine()) {
                readLine = reader.nextLine();

                tempEvent = getEvent(readLine);
                if (tempEvent != null) {
                    switch (tempEvent.eventDay) {
                        case SUNDAY:
                            sunday.add(tempEvent);
                            break;
                        case MONDAY:
                            monday.add(tempEvent);
                            break;
                        case TUESDAY:
                            tuesday.add(tempEvent);
                            break;
                        case WEDNESDAY:
                            wednesday.add(tempEvent);
                            break;
                        case THURSDAY:
                            thursday.add(tempEvent);
                            break;
                        case FRIDAY:
                            friday.add(tempEvent);
                            break;
                        case SATURDAY:
                            saturday.add(tempEvent);
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("No events for this day.");
        }

    }



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
