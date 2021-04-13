package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E04TrekkingMania {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int groupCount = Integer.parseInt(console.nextLine());
        int totalPeople = 0;

        double musala = 0;
        double monblan = 0;
        double kiliman = 0;
        double k2 = 0;
        double everest = 0;

        for (int i = 1; i <= groupCount; i++) {
            int peoplePerGroup = Integer.parseInt(console.nextLine());
            totalPeople += peoplePerGroup;

            if (peoplePerGroup <= 5) {
                musala += peoplePerGroup;
            } else if (peoplePerGroup <= 12) {
                monblan += peoplePerGroup;
            } else if (peoplePerGroup <= 25) {
                kiliman += peoplePerGroup;
            } else if (peoplePerGroup <= 40) {
                k2 += peoplePerGroup;
            } else {
                everest += peoplePerGroup;
            }
        }
        System.out.printf("%.2f%%\n", musala / totalPeople * 100);
        System.out.printf("%.2f%%\n", monblan / totalPeople * 100);
        System.out.printf("%.2f%%\n", kiliman / totalPeople * 100);
        System.out.printf("%.2f%%\n", k2 / totalPeople * 100);
        System.out.printf("%.2f%%", everest / totalPeople * 100);
    }
}
