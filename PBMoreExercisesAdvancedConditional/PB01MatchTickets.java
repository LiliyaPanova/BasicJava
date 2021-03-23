package PBMoreExercisesAdvancedConditional;

import java.util.Scanner;

public class PB01MatchTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Input
        double budget = Double.parseDouble(console.nextLine());
        String category = console.nextLine();
        int group = Integer.parseInt(console.nextLine());

        double ticketPrice = 0.0;
        double transport = 0.0;

        //Tickets price
        if (category.equals("VIP")) {
            ticketPrice = 499.99;
        } else {
            ticketPrice = 249.99;
        }

        double ticketSum = group * ticketPrice;

        if (group <= 4) {
            transport = budget * 0.75;
        } else if (group >= 5 && group <= 9) {
            transport = budget * 0.6;
        } else if (group >= 10 && group <= 24) {
            transport = budget * 0.5;
        } else if (group >= 25 && group <= 49) {
            transport = budget * 0.4;
        } else if (group >= 50) {
            transport = budget * 0.25;
        }

        double leftMoney = budget - ticketSum - transport;

        if (leftMoney >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(leftMoney));
        }

    }
}
