package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner lengthInput = new Scanner(System.in);
        System.out.println("Length of Rectangle: ");
        Integer length = lengthInput.nextInt();

        Scanner widthInput = new Scanner(System.in);
        System.out.println("Width of Rectangle: ");
        Integer width = widthInput.nextInt();

        Scanner dimensionInput = new Scanner(System.in);
        System.out.println("Type of Dimensions: ");
        String dimType = dimensionInput.nextLine();

        Integer areaOfRectangle = (length * width);
        System.out.println("The area of the rectangle is: " + areaOfRectangle + " sq. " + dimType);
    }
}
