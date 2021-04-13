package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E03FitnesCard {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Integer.parseInt(console.nextLine());
        String gender = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String sport = console.nextLine();
        double tax = 0;

        switch (sport) {
            case "Gym":
                if (gender.equals("m")) {
                    tax = 42;
                } else {
                    tax = 41;
                }
                break;
            case "Boxing":
                if (gender.equals("m")) {
                    tax = 41;
                } else {
                    tax = 37;
                }
                break;
            case "Yoga":
                if (gender.equals("m")) {
                    tax = 45;
                } else {
                    tax = 42;
                }
                break;
            case "Zumba":
                if (gender.equals("m")) {
                    tax = 34;
                } else {
                    tax = 31;
                }
                break;
            case "Dances":
                if (gender.equals("m")) {
                    tax = 51;
                } else {
                    tax = 53;
                }
                break;
            case "Pilates":
                if (gender.equals("m")) {
                    tax = 39;
                } else {
                    tax = 37;
                }
                break;
        }
        if (age <= 19) {
            tax -= (tax * 0.20);
        }

        if (tax <= budget) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(tax - budget));
        }
    }
}
