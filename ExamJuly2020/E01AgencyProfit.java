package ExamPrep.ExamJuly2020;

import java.util.Scanner;

public class E01AgencyProfit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String company = console.nextLine();
        int adultTickets = Integer.parseInt(console.nextLine());
        int kidTickets = Integer.parseInt(console.nextLine());
        double adultPrice = Double.parseDouble(console.nextLine());
        double tax = Double.parseDouble(console.nextLine());

        double kidPrice = adultPrice * 0.30;
        adultPrice+=tax;
        kidPrice+=tax;

        double totalSum = (adultPrice * adultTickets) + (kidPrice * kidTickets);
        totalSum*=0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company, totalSum);

    }
}
