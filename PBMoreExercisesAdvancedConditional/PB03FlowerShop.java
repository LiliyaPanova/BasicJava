package PBMoreExercisesAdvancedConditional;

import java.util.Scanner;

public class PB03FlowerShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Input
        int chrysanthemum = Integer.parseInt(console.nextLine());
        int rose = Integer.parseInt(console.nextLine());
        int tulip = Integer.parseInt(console.nextLine());
        String season = console.nextLine();
        String holiday = console.nextLine();

        double tulipSum = 0.0;
        double roseSum = 0.0;
        double chrysanSum = 0.0;
        double totalSum = 0.0;

        switch (season) {
            case "Spring":
            case "Summer":
                tulipSum = tulip * 2.50;
                roseSum = rose * 4.10;
                chrysanSum = chrysanthemum * 2.00;
                totalSum = tulipSum + roseSum + chrysanSum;
                if (season.equals("Spring") && tulip >= 7) {
                    totalSum = totalSum - (totalSum * 0.05);
                }
                break;
            case "Autumn":
            case "Winter":
                tulipSum = tulip * 4.15;
                roseSum = rose * 4.50;
                chrysanSum = chrysanthemum * 3.75;
                totalSum = tulipSum + roseSum + chrysanSum;
                if (season.equals("Winter") && rose >= 10) {
                    totalSum = totalSum - (totalSum * 0.10);
                }
                break;
        }
            if ((tulip + rose + chrysanthemum) > 20) {
                totalSum = totalSum - (totalSum * 0.20);
            }

            if (holiday.equals("Y")) {
                totalSum = totalSum + (totalSum * 0.15);

            }
        System.out.printf("%.2f", (totalSum + 2));


    }
}
