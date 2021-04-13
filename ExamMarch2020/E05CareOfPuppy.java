package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E05CareOfPuppy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int foodKG = Integer.parseInt(console.nextLine());
        String input = console.nextLine();

        foodKG*=1000;
        int totalGrams = 0;

        while (!input.equals("Adopted")) {
            int gramPerDay = Integer.parseInt(input);
            totalGrams+=gramPerDay;

            input = console.nextLine();
        }

        if (totalGrams <= foodKG) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodKG - totalGrams);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", totalGrams - foodKG);
        }
    }
}
