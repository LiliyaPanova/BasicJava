package PBMoreExercises.ConditionalStatements;

import java.util.Scanner;

public class P07FlowerSHop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Input
        int magnoliaCount = Integer.parseInt(console.nextLine());
        int zumbuliCount = Integer.parseInt(console.nextLine());
        int roseCount = Integer.parseInt(console.nextLine());
        int cactusCount = Integer.parseInt(console.nextLine());
        double giftPrice = Double.parseDouble(console.nextLine());

        //Calculations of the flower order
        double magnoliaSum = magnoliaCount * 3.25;
        double zumbulSum = zumbuliCount * 4;
        double roseSum = roseCount * 3.50;
        double cactusSum = cactusCount * 8;

        double orderSum = magnoliaSum + zumbulSum + roseSum + cactusSum;
        double totalSum = orderSum - (orderSum * 0.05);

        if (totalSum >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(totalSum - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - totalSum));
        }
    }
}
