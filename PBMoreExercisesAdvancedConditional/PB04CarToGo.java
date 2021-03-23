package PBMoreExercisesAdvancedConditional;

import java.util.Scanner;

public class PB04CarToGo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine();
        double carPrice = 0.0;
        String classCar = "";
        String carModel = "";

        if (budget <= 100) {
            classCar = "Economy class";
            if (season.equals("Summer")) {
                carModel = "Cabrio";
                carPrice = budget * 0.35;
            } else {
                carModel = "Jeep";
                carPrice = budget * 0.65;
            }
        } else if (budget > 100 && budget <= 500) {
            classCar = "Compact class";
            if (season.equals("Summer")) {
                carModel = "Cabrio";
                carPrice = budget * 0.45;
            } else {
                carModel = "Jeep";
                carPrice = budget * 0.80;
            }
        } else if (budget > 500) {
            carModel = "Jeep";
            classCar = "Luxury class";
            carPrice = budget * 0.90;
        }
        System.out.printf("%s\n" +
                "%s - %.2f", classCar, carModel, carPrice);
    }
}
