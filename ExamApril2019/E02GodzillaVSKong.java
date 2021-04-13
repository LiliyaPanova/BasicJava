package ExamPrep.ExamApril2019;

import java.util.Scanner;

public class E02GodzillaVSKong {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        int statist = Integer.parseInt(console.nextLine());
        double clothesPerSt = Double.parseDouble(console.nextLine());

        double decor = budget * 0.10;
        double totalClothes = statist * clothesPerSt;

        if (statist > 150) {
            totalClothes-= totalClothes * 0.10;
        }
        double totalSum = totalClothes + decor;

        if (budget >=totalSum) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSum);
        } else {
            System.out.printf("Not enough money!%n" + "Wingard needs %.2f leva more.", totalSum - budget);
        }
    }
}
