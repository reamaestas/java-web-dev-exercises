package studios.lsn1areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner radiusInput = new Scanner(System.in);
        System.out.println("Radius of the Circle: ");
        Double radius = radiusInput.nextDouble();
        Double circleRadius = Circle.getArea(radius);
        System.out.println("The area of the circle is: " + circleRadius);
    }
}
