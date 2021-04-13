package ExamPrep.ExamApril2019;

import java.util.Scanner;

public class E01OscarsCeremony {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int rent = Integer.parseInt(console.nextLine());

        double statue = rent - (rent * 0.30);
        double catering = statue - (statue * 0.15);
        double sound = catering / 2;

        System.out.printf("%.2f", rent + statue + sound + catering);
    }
}
