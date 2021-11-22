public class SpeedyConverter {

    public static void main(String[] args) {
        printConversion(0);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour/ 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long roundedMiles = 0;
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            roundedMiles = toMilesPerHour(kilometersPerHour);

            System.out.println( kilometersPerHour + " km/h = " + roundedMiles + " mi/h");
        }
    }
}
