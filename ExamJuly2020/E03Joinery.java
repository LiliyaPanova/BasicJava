package ExamPrep.ExamJuly2020;

import java.util.Scanner;

public class E03Joinery {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int countJoinery = Integer.parseInt(console.nextLine());
        String kind = console.nextLine();
        String delivery = console.nextLine();

        double pricePerPiece = 0;
        double sum = 0;

        switch (kind) {
            case "90X130":
                pricePerPiece = 110;
                if (countJoinery > 30 && countJoinery <= 60) {
                    pricePerPiece -= pricePerPiece * 0.05;
                } else if (countJoinery > 60) {
                    pricePerPiece -= pricePerPiece * 0.08;
                }
                break;
            case "100X150":
                pricePerPiece = 140;
                if (countJoinery > 40 && countJoinery <= 80) {
                    pricePerPiece -= pricePerPiece * 0.06;
                } else if (countJoinery > 80) {
                    pricePerPiece -= pricePerPiece * 0.10;
                }
                break;
            case "130X180":
                pricePerPiece = 190;
                if (countJoinery > 20 && countJoinery <= 50) {
                    pricePerPiece -= pricePerPiece * 0.07;
                } else if (countJoinery > 50) {
                    pricePerPiece -= pricePerPiece * 0.12;
                }
                break;
            case "200X300":
                pricePerPiece = 250;
                if (countJoinery > 25 && countJoinery <= 50) {
                    pricePerPiece -= pricePerPiece * 0.09;
                } else if (countJoinery > 50) {
                    pricePerPiece -= pricePerPiece * 0.14;
                }
                break;
        }

        sum = pricePerPiece * countJoinery;

        if (delivery.equals("With delivery")) {
            sum += 60;
        }

        if (countJoinery > 99) {
            sum -= sum * 0.04;
        }
        if (countJoinery <= 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", sum);
        }

    }
}
