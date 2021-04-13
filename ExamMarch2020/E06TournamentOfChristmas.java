package ExamPrep.ExamMarch2020;

import java.util.Scanner;

public class E06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());

        int totalWin = 0;
        int totalLose = 0;
        double totalMoney = 0;

            for (int i = 1; i <= days; i++) {
                String input = console.nextLine();
                int win = 0;
                int lose = 0;
                double moneyPerDay = 0;

                while (!input.equals("Finish")) {
                    String sport = input;
                    String result = console.nextLine();
                    if (result.equals("win")) {
                        win++;
                        totalWin++;
                        moneyPerDay += 20;
                    } else {
                        lose++;
                        totalLose++;
                    }
                    input = console.nextLine();
                }
                if (win > lose) {
                    moneyPerDay += moneyPerDay * 0.1;

                }
                totalMoney += moneyPerDay;

            }


        if (totalWin > totalLose) {
            totalMoney += totalMoney * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }

    }
}