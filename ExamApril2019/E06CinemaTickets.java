package ExamPrep.ExamApril2019;

import java.util.Scanner;

public class E06CinemaTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        int standard = 0;
        int student = 0;
        int kid = 0;
        int totalTickets = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeats = Integer.parseInt(console.nextLine());

            int counterTicket = 0;
            String command = console.nextLine();
            while (!command.equals("End")) {
                String typeTicket = command;
                counterTicket++;

                if (typeTicket.equals("student")) {
                    student++;
                } else if (typeTicket.equals("standard")) {
                    standard++;
                } else if (typeTicket.equals("kid")) {
                    kid++;
                }

                if (counterTicket == freeSeats) {
                    break;
                }
                command = console.nextLine();
            }
            totalTickets+=counterTicket;
            System.out.printf("%s - %.2f%% full.%n", movieName, counterTicket * 1.0 / freeSeats * 100);
            input = console.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kid * 1.0 / totalTickets * 100);

    }
}
