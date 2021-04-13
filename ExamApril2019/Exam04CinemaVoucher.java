package ExamPrep.ExamApril2019;

import java.util.Scanner;

public class Exam04CinemaVoucher {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int voucherAmount = Integer.parseInt(console.nextLine());
        String purchases = console.nextLine();
        int tickets = 0;
        int others = 0;

        while (!purchases.equals("End")) {
            if (purchases.length() > 8) {  //Ако името на покупката съдържа повече от 8 символа, то тя е билет
                int ticketPrice = purchases.charAt(0) + purchases.charAt(1);//за филм, а нейната цена представлява сумата на ASCII символите от първите ѝ два символа.
                voucherAmount -= ticketPrice;
                if (voucherAmount < 0) {
                    break;
                }
                    tickets++;
            } else {
                int price = purchases.charAt(0);
                voucherAmount -= price;
                if (voucherAmount < 0) {
                    break;
                }
                others++;
            }
            purchases = console.nextLine();
        }
        System.out.println (tickets);
        System.out.println (others);
    }
}
