package ExamPrep.ExamApril2019;

import java.util.Scanner;

public class E04CinemaVoucher {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int voucher = Integer.parseInt(console.nextLine());
        String input = console.nextLine();
        int tickets = 0;
        int others = 0;
        double sum = 0;

        while (!input.equals("End")) {
            int length = input.length();

            if (length > 8) {
                sum = input.charAt(0) + input.charAt(1);
                voucher-=sum;
                if (voucher < 0) {
                    break;
                }
                tickets++;
            } else {
                sum = input.charAt(0);
                voucher-=sum;
                if (voucher < 0) {
                    break;
                }
                others++;
            }
            input = console.nextLine();
        }
        System.out.println (tickets);
        System.out.println (others);
    }
}
