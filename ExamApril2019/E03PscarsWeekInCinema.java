package ExamPrep.ExamApril2019;

import java.util.Scanner;

public class E03PscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String movie = console.nextLine();
        String room = console.nextLine();
        int tickets = Integer.parseInt(console.nextLine());

        double sum = 0;

        switch (movie) {
            case "A Star Is Born":
                if (room.equals("normal")) {
                    sum = tickets * 7.50;
                } else if (room.equals("luxury")){
                    sum = tickets * 10.50;
                } else {
                    sum = tickets * 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (room.equals("normal")) {
                    sum = tickets * 7.35;
                } else if (room.equals("luxury")){
                    sum = tickets * 9.45;
                } else {
                    sum = tickets * 12.75;
                }
                break;
            case "Green Book":
                if (room.equals("normal")) {
                    sum = tickets * 8.15;
                } else if (room.equals("luxury")){
                    sum = tickets * 10.25;
                } else {
                    sum = tickets * 13.25;
                }
                break;
            default:
                if (room.equals("normal")) {
                    sum = tickets * 8.75;
                } else if (room.equals("luxury")){
                    sum = tickets * 11.55;
                } else {
                    sum = tickets * 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movie, sum);
    }
}
