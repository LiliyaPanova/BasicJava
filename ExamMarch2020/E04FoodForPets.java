package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E04FoodForPets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());
        double totalFood = Double.parseDouble(console.nextLine());
        int foodPerDay = 0;
        double biscuits = 0;
        double currentBis = 0;
        int dogTotal = 0;
        int catTotal = 0;

        for (int i = 1; i <=days ; i++) {
            int dogFood = Integer.parseInt(console.nextLine());
            int catFood = Integer.parseInt(console.nextLine());

            if (i % 3 == 0) {
                currentBis =  (dogFood + catFood)  * 0.1;
                biscuits+=currentBis;
            }
            foodPerDay += catFood + dogFood;
            catTotal+=catFood;
            dogTotal += dogFood;
        }
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", foodPerDay / totalFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", dogTotal * 1.0/ foodPerDay * 100);
        System.out.printf("%.2f%% eaten from the cat.", catTotal * 1.0 / foodPerDay * 100);
    }
}
