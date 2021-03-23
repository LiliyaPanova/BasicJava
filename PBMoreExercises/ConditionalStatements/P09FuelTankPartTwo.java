package PBMoreExercises.ConditionalStatements;

import java.util.Scanner;

public class P09FuelTankPartTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Input
        String fuelType = console.nextLine();
        double fuelQuantity = Double.parseDouble(console.nextLine());
        String clubCard = console.nextLine();

        double totalSum = 0.0;
        //Fuel price
        double gasolinePrice = 2.22; //бензин
        double dieselPrice = 2.33;
        double gasPrice = 0.93;

        if (clubCard.equals("Yes")) {
            gasolinePrice = gasolinePrice - 0.18;
            dieselPrice = dieselPrice - 0.12;
            gasPrice = gasPrice - 0.08;
        }

        switch (fuelType) {
            case "Gasoline":
                totalSum = fuelQuantity * gasolinePrice;
                break;
            case "Diesel":
                totalSum = fuelQuantity * dieselPrice;
                break;
            case "Gas":
                totalSum = fuelQuantity * gasPrice;
                break;
        }

        if (fuelQuantity >= 20 && fuelQuantity <= 25) {
            totalSum = totalSum - (totalSum * 0.08);
        } else if (fuelQuantity > 25) {
            totalSum = totalSum - (totalSum * 0.1);
        }

        System.out.printf("%.2f lv.", totalSum);
    }
}
