package ExamPrep.ExamJuly2020;

import java.util.Scanner;

public class E06Barcode {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int minRange = Integer.parseInt(console.nextLine());
        int maxRange = Integer.parseInt(console.nextLine());

        int firstMin = minRange / 1000;
        int secondMin = (minRange / 100) % 10;
        int thirdMin = (minRange / 10) % 10;
        int fourthMin = minRange % 10;

        int firstMax = maxRange / 1000;
        int secondMax = (maxRange / 100) % 10;
        int thirdMax = (maxRange / 10) % 10;
        int fourthMax = maxRange % 10;

        for (int i = firstMin; i <= firstMax; i++) {
            for (int j = secondMin; j <= secondMax; j++) {
                for (int k = thirdMin; k <= thirdMax; k++) {
                    for (int l = fourthMin; l <= fourthMax; l++) {
                        if (i % 2 !=0 && j % 2 !=0 && k % 2 !=0 && l % 2 !=0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}