package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner milesInput = new Scanner(System.in);
        System.out.println("Miles driven: ");
        Integer miles = milesInput.nextInt();

        Scanner gallonsInput = new Scanner(System.in);
        System.out.println("Gallons of gas: ");
        Integer gallons = gallonsInput.nextInt();

        Integer milesPerGallon = (miles/gallons);
        System.out.println("Your calculated Miles per Gallon: " + milesPerGallon);
    }
}
