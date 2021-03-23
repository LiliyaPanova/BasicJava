package Labs;

import java.util.Scanner;

public class Godzilla {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        int statists = Integer.parseInt(console.nextLine());
        double priceClothes = Double.parseDouble(console.nextLine());

        double decor = budget * 0.1;


        if (statists > 150) {
            priceClothes = priceClothes - priceClothes * 0.1;
            // price *= 0.9
        }

        double neededMoney = statists * priceClothes + decor;

        double difference = Math.abs(neededMoney-budget);

        if (neededMoney > budget){
            System.out.printf("Not enough money! \n" +
                    "Wingard needs %.2f leva more.", difference);

        } else{
            System.out.printf("Action!\n" +
                    "Wingard starts filming with %.2f leva left.", difference);
        }
    }
}
