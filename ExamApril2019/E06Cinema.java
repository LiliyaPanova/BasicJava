package ExamPrep.ExamApril2019;

import java.util.Scanner;

public class E06Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        int standard = 0;
        int student = 0;
        int kid = 0;
        double totalTickets = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int emptyPlaces = Integer.parseInt(console.nextLine());
            double currentPlaces = 0;

            String text = console.nextLine();
            while (!text.equals("End")) {
                String ticketType = text;
                totalTickets++;
                currentPlaces++;
                if (ticketType.equals("standard")) {
                    standard++;
                } else if (ticketType.equals("student")) {
                    student++;
                } else if (ticketType.equals("kid")) {
                    kid++;
                }

                if (currentPlaces == emptyPlaces) {
                    break;
                }
                text = console.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", input, currentPlaces / emptyPlaces * 100);

            input = console.nextLine();
        }
        System.out.printf("Total tickets: %.0f%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kid / totalTickets * 100);
    }
}
