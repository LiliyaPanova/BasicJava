package PBMoreExercisesAdvancedConditional;

import java.util.Scanner;

public class PB02BikeRace {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Input
        int juniors = Integer.parseInt(console.nextLine());
        int seniors = Integer.parseInt(console.nextLine());
        String trace = console.nextLine();

        double sum = 0.0;

        switch (trace) {
            case "trail":
                sum = (juniors * 5.50 + seniors * 7);
                sum = sum - (sum * 0.05);
                break;
            case "cross-country":
                if ((juniors + seniors) >= 50) {
                    sum = (juniors * 8 + seniors * 9.50) ;
                    sum = sum - (sum * 0.25);
                    sum = sum - (sum * 0.05);
                } else {
                    sum = (juniors * 8 + seniors * 9.50);
                    sum = sum - (sum * 0.05);
                }
                break;
            case "downhill":
                sum = (juniors * 12.25 + seniors * 13.75);
                sum = sum - (sum * 0.05);
                break;
            case "road":
                sum = (juniors * 20 + seniors * 21.50);
                sum = sum - (sum * 0.05);
                break;
        }
        System.out.printf("%.2f", sum);
    }

}
