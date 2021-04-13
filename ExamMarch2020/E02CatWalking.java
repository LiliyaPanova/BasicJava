package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E02CatWalking {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int minutesPerWalk = Integer.parseInt(console.nextLine());
        int walksPerDay = Integer.parseInt(console.nextLine());
        int caloriesPerDay = Integer.parseInt(console.nextLine());

        int totalMinutes = minutesPerWalk * walksPerDay;
        int burnedCalories = totalMinutes * 5;
        int halfCalories = caloriesPerDay / 2;

        if (burnedCalories >= halfCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }
    }
}
