package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double volumePlane = Double.parseDouble(console.nextLine());
        String input = console.nextLine();
        int counter = 0;
        boolean isFull = false;

        while (!input.equals("End")) {
            double suitcase = Double.parseDouble(input);
            counter++;
            if (counter % 3 == 0 && counter > 0) {
                suitcase+= suitcase * 0.1;
            }
            volumePlane-=suitcase;
            if (volumePlane < 0) {
                System.out.println("No more space!");
                isFull=true;
                counter--;
                break;
            }

            input = console.nextLine();
        }

        if (!isFull) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counter);
    }
}
