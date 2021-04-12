package ExamPrep.ExamJuly2020;

import java.util.Scanner;

public class E04Balls {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int count = Integer.parseInt(console.nextLine());
        int points = 0;
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int others = 0;

        for (int i = 1; i <=count ; i++) {
            String color = console.nextLine();

            switch (color) {
                case "red":
                    points+=5;
                    red++;
                    break;
                case "orange":
                    points+=10;
                    orange++;
                    break;
                case "yellow":
                    points+=15;
                    yellow++;
                    break;
                case "white":
                    points+=20;
                    white++;
                    break;
                case "black":
                    points = points / 2;
                    black++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Points from red balls: %d%n", red);
        System.out.printf("Points from orange balls: %d%n", orange);
        System.out.printf("Points from yellow balls: %d%n", yellow);
        System.out.printf("Points from white balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", others);
        System.out.printf("Divides from black balls: %d", black);
    }
}
