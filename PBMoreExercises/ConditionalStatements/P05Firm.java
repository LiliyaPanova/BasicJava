package PBMoreExercises.ConditionalStatements;

import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Input
        int neededH = Integer.parseInt(console.nextLine());
        int days = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());

        //През 10% от дните служителите са на обучение и не могат да работят по проекта.
        double hTrainingPerDay = days - (days * 0.1);
        //Един работен ден е 8 часа, а извънредните 2 часа
        double neededD = hTrainingPerDay * 8;

        double extraWork = workers * (days * 2);
        double totalH = Math.floor(neededD + extraWork);

        if (totalH - neededH >= 0) {
            System.out.printf("Yes!%.0f hours left.", totalH - neededH);
        } else if (totalH - neededH < 0){
            System.out.printf("Not enough time!%.0f hours needed.", neededH - totalH);
        }

    }
}
