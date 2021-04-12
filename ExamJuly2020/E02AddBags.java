package ExamPrep.ExamJuly2020;

import java.util.Scanner;

public class E02AddBags {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double luggageAbove20 = Double.parseDouble(console.nextLine());
        double luggageKG = Double.parseDouble(console.nextLine());
        int leftDays = Integer.parseInt(console.nextLine());
        int luggageCount = Integer.parseInt(console.nextLine());

        double luggagePrice = 0;

        if (luggageKG < 10) {
            luggagePrice =luggageAbove20 * 0.20;
        } else if (luggageKG >= 10 && luggageKG <=20) {
            luggagePrice =luggageAbove20 * 0.50;
        } else if (luggageKG > 20) {
            luggagePrice=luggageAbove20;
        }

        if (leftDays > 30) {
            luggagePrice = luggagePrice + (luggagePrice * 0.10);
        } else if (leftDays <= 30 && leftDays >= 7) {
            luggagePrice = luggagePrice + (luggagePrice * 0.15);
        } else if (leftDays < 7) {
            luggagePrice = luggagePrice + (luggagePrice * 0.40);
        }

        luggagePrice*=luggageCount;

        System.out.printf("The total price of bags is: %.2f lv.", luggagePrice);
    }
}
