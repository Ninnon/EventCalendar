package weeklyCalendar;

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Week {
    // File to read/write to
//    File file = new File(GuiApp.class.getResourceAsStream())

    //Use array list for each day
    static List<Event> sunday = new ArrayList<>(Arrays.asList());
    static List<Event> monday = new ArrayList<>(Arrays.asList());
    static List<Event> tuesday = new ArrayList<>(Arrays.asList());
    static List<Event> wednesday = new ArrayList<>(Arrays.asList());
    static List<Event> thursday = new ArrayList<>(Arrays.asList());
    static List<Event> friday = new ArrayList<>(Arrays.asList());
    static List<Event> saturday = new ArrayList<>(Arrays.asList());

    // Read the file
        // Also put the lines that are read into the right Day list using a switch statement
    public void readFile() {
        String readLine = "";
        Event tempEvent;
        try (Scanner reader = new Scanner(GuiApp.class.getResourceAsStream("week.csv"))){
            while (reader.hasNextLine()) {
                readLine = reader.nextLine();

                tempEvent = getEvent(readLine);
                if (tempEvent != null) {
                    switch (tempEvent.eventDay) {
                        case SUNDAY:
                            sunday.add(tempEvent);
                            Collections.sort(sunday);
                            break;
                        case MONDAY:
                            monday.add(tempEvent);
                            Collections.sort(monday);
                            break;
                        case TUESDAY:
                            tuesday.add(tempEvent);
                            Collections.sort(tuesday);
                            break;
                        case WEDNESDAY:
                            wednesday.add(tempEvent);
                            Collections.sort(wednesday);
                            break;
                        case THURSDAY:
                            thursday.add(tempEvent);
                            Collections.sort(thursday);
                            break;
                        case FRIDAY:
                            friday.add(tempEvent);
                            Collections.sort(friday);
                            break;
                        case SATURDAY:
                            saturday.add(tempEvent);
                            Collections.sort(saturday);
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
        
        String[] temp = line.split(",");

        title = temp[0];
        day = Day.parseDay(temp[1]);
        start = LocalTime.parse(temp[2]);


        return new Event(title, day, start);
    }

    // Write the file
    public void writeFile() {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("src//weeklyCalendar//week.csv", false));

            // Need to clear out file first, then write the contents of all lists back to the file
            //            out.close();

            // Now add everything from the lists back to the file, including new things the user added
            for (Event e : sunday) {
            	out.println(e.toFileLine());
            }
            for (Event e : monday) {
                out.println(e.toFileLine());
            }
            for (Event e : tuesday) {
                out.println(e.toFileLine());
            }
            for (Event e : wednesday) {
                out.println(e.toFileLine());
            }
            for (Event e : thursday) {
                out.println(e.toFileLine());
            }
            for (Event e : friday) {
                out.println(e.toFileLine());
            }
            for (Event e : saturday) {
                out.println(e.toFileLine());
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
