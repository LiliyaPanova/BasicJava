package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E02MountainRun {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double record = Double.parseDouble(console.nextLine());
        double distance = Double.parseDouble(console.nextLine());
        double timePerMeter = Double.parseDouble(console.nextLine());

        double time = distance * timePerMeter;
        double slowTime = Math.floor((distance / 50)) * 30;
        time +=slowTime;

        if (time < record){
            System.out.printf("Yes! The new record is %.2f seconds.", time);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(record - time));
        }
    }
}
