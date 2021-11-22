/**
Write a method named area with one double parameter named radius.
The method needs to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value.
Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.
If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
For formulas and PI value please check the tips below.
Examples of input/output:
* area(5.0); should return 78.53975
* area(-1);  should return -1 since the parameter is negative
* area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
* area(-1.0, 4.0);  should return -1 since first the parameter is negative

TIP: The formula for calculating the area of a rectangle is x * y.
TIP: The formula for calculating a circle area is radius * radius * PI.
TIP: For PI use a constant from Math class e.g. Math.PI
NOTE: All methods need to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to your solution code!
 */

public class AreaCalculator {

    public static final double INVALID_VALUE_MESSAGE = -1.0;

    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(5, 9));
    }

    public static double area(double radius) {
        double cirleArea;
        if (radius < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        cirleArea = radius * radius * Math.PI;
        return cirleArea;
    }

    public static double area(double x, double y) {
        double rectangleArea;
        if (x < 0 || y < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        rectangleArea = x * y;
        return rectangleArea;
    }

}
