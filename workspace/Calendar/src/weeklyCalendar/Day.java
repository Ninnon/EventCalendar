package weeklyCalendar;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Switch statement to parse day
    public static Day parseDay(String string) {
        Day day;
        switch (string.toUpperCase()) {
        //Did toUpperCase() so a user won't always have to input the date in all caps
            case "SUNDAY":
                day = SUNDAY;
                break;
            case "MONDAY":
                day = MONDAY;
                break;
            case "TUESDAY":
                day = TUESDAY;
                break;
            case "WEDNESDAY":
                day = WEDNESDAY;
                break;
            case "THURSDAY":
                day = THURSDAY;
                break;
            case "FRIDAY":
                day = FRIDAY;
                break;
            case "SATURDAY":
                day = SATURDAY;
                break;
            default:
                day = SUNDAY;
                break;
        }

        return day;
    }
}
