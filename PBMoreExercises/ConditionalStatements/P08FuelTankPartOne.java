package PBMoreExercises.ConditionalStatements;

import java.util.Locale;
import java.util.Scanner;

public class P08FuelTankPartOne {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Input
        String fuel = console.nextLine();
        double litters = Double.parseDouble(console.nextLine());

        if (fuel.equals("Diesel") || fuel.equals("Gasoline") || fuel.equals("Gas")) {
            if (litters >= 25) {
                System.out.printf("You have enough %s.", fuel.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }

    }
}
