package ExamPrep.ExamApril2019;

import java.util.Scanner;

public class E05MovieRatings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int movies = Integer.parseInt(console.nextLine());
        double maxRate = Double.NEGATIVE_INFINITY;
        double minRate = Double.POSITIVE_INFINITY;
        String highestMovie = "";
        String lowestMovie = "";
        double averageRate = 0;

        for (int i = 1; i <=movies ; i++) {
            String movieName = console.nextLine();
            double rate = Double.parseDouble(console.nextLine());
            averageRate+=rate;

            if (rate > maxRate) {
                maxRate = rate;
                highestMovie = movieName;
            }
            if (rate < minRate) {
                minRate = rate;
                lowestMovie = movieName;
            }

        }

        averageRate = averageRate / movies;

        System.out.printf("%s is with highest rating: %.1f%n", highestMovie, maxRate);
        System.out.printf("%s is with lowest rating: %.1f%n", lowestMovie, minRate);
        System.out.printf("Average rating: %.1f", averageRate);
    }
}
