/*
    Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
    You should validate that the first parameter minutes is >= 0.
    You should validate that the 2nd parameter seconds is >=0 and <= 59.
    should return "invalid value" if either of the above are not true
    if valid: calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return the value as String in format
    "XXh YYm ZZs" where.

    2nd method: only one parameter
    validate >=0 and return if it is not true
    if valid calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.

 */
public class SecondsAndMinutesChallenge {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes >= 0 || seconds >= 0 && seconds <= 59) {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            return hours + "h " + minutes + "m " + remainingMinutes + "s";
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(long seconds) {
        if (seconds >= 0) {
            long minutes = seconds / 60;
            long remainingMinutes = minutes % 60;
            return getDurationString(minutes, remainingMinutes);
        }
        return INVALID_VALUE_MESSAGE;
    }
}