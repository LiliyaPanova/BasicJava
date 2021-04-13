package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E01SuppliesForSchool {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int penCount = Integer.parseInt(console.nextLine());
        int markerCount = Integer.parseInt(console.nextLine());
        double cleanerLitters = Double.parseDouble(console.nextLine());
        double discount = Integer.parseInt(console.nextLine());

        double penTotal = penCount * 5.80;
        double markerTotal = markerCount * 7.20;
        double cleanerTotal = cleanerLitters * 1.20;

        double totalSum = penTotal + markerTotal + cleanerTotal;
        totalSum = totalSum - (totalSum * discount / 100);

        System.out.printf("%.3f", totalSum);
    }
}
