package PBMoreExercises.ConditionalStatements;

import java.util.Scanner;

public class P06Pets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Вход
        int days = Integer.parseInt(console.nextLine());
        int foodInStock = Integer.parseInt(console.nextLine());
        double dogPerDay = Double.parseDouble(console.nextLine());
        double catPerDay = Double.parseDouble(console.nextLine());
        double turtlePerDay = Double.parseDouble(console.nextLine());

        double dogSum = days * dogPerDay;
        double catSum = days * catPerDay;
        double turtleSum = (days * turtlePerDay) / 1000;

        double totalFoodSum = dogSum + catSum + turtleSum;

        if (totalFoodSum <= foodInStock) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodInStock - totalFoodSum));
        } else if (totalFoodSum > foodInStock) {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodSum - foodInStock));
        }
    }
}
