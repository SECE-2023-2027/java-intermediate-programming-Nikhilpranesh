class AreaCalculator {

    // Circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Square
    public static double calculateArea(int side) {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(AreaCalculator.calculateArea(5.0)); // Circle
        System.out.println(AreaCalculator.calculateArea(4, 5)); // Rectangle
        System.out.println(AreaCalculator.calculateArea(4)); // Square
    }
}