package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E03EnergyBooster {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String fruit = console.nextLine();
        String size = console.nextLine();
        int count = Integer.parseInt(console.nextLine());
        double price = 0;
        double sum = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = 2 * 56;
                } else {
                    price = 5 * 28.70;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = 2 * 36.66;
                } else {
                    price = 5 * 19.60;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = 2 * 42.10;
                } else {
                    price = 5 * 24.80;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = 2 * 20;
                } else {
                    price = 5 * 15.20;
                }
                break;
        }
        sum = price * count;
        if (sum >= 400 && sum <=1000) {
            sum = sum - (sum * 0.15);
        } else if (sum > 1000){
            sum /=2;
        }
        System.out.printf("%.2f lv.", sum);
    }
}
