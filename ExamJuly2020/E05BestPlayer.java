package ExamPrep.ExamJuly2020;

import java.time.temporal.IsoFields;
import java.util.Scanner;

public class E05BestPlayer {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String player = "";
        int maxGoals = Integer.MIN_VALUE;
        boolean hatTrick = false;
        boolean moreThan10 = false;

        while (!input.equals("END")) {

            int goal = Integer.parseInt(console.nextLine());

            if (goal > maxGoals) {
                maxGoals = goal;
                player = input;
            }

            if (maxGoals >= 3 && maxGoals < 10) {
                hatTrick = true;
            } else if (maxGoals >= 10) {
                moreThan10 = true;
                break;
            }
            input = console.nextLine();

        }
        System.out.printf("%s is the best player!%n", player);

        if (hatTrick || moreThan10) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
