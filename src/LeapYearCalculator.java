public class LeapYearCalculator {
    public static void main(String[] args) {
        boolean response = isLeapYear(1924);
        System.out.println(response);
    }

    public static boolean isLeapYear(int namedYear) {
        if(namedYear < 1 && namedYear > 9999){
            return false;
        } else if((namedYear % 4 == 0 && namedYear % 100 != 0) && (namedYear >= 1 && namedYear <= 9999)|| namedYear % 400 == 0 && (namedYear >= 1 && namedYear <= 9999)){
            return true;
        } else {
            return false;
        }
    }
}
