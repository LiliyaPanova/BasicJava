package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E01ChangeBureau {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double bitcoins = Double.parseDouble(console.nextLine());
        double yoan = Double.parseDouble(console.nextLine());
        double tax = Double.parseDouble(console.nextLine());

        tax = tax / 100;
        double bitPrice = 1168;   //lv
        double yoanPrice = 0.15; // dollars
        double dollarPrice = 1.76; // lv
        double euroPrice = 1.95; // lv

        double bitSumLV = bitcoins * bitPrice;
        double yoanSumDollar = yoan * yoanPrice;
        double yoanSumLV = yoanSumDollar * dollarPrice;

        double sumEuro = (bitSumLV + yoanSumLV) / euroPrice;
        sumEuro = sumEuro - (sumEuro * tax);

        System.out.printf("%.2f", sumEuro);
    }
}
