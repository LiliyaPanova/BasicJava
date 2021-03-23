package Labs;

import java.util.Scanner;

public class Schoolar {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double income = Double.parseDouble(console.nextLine());
        double average = Double.parseDouble(console.nextLine());
        double minSalary = Double.parseDouble(console.nextLine());

        double socialSchol = 0.0;
        double excellSchol = 0.0;


        //Проверка за социална ступендия
        if (income < minSalary) {
            if (average > 4.5) {
                socialSchol = Math.floor(minSalary * 0.35);
            }
        }

        //Проверка за отлична стипендия
        if (average >= 5.50) {
            excellSchol = Math.floor(average * 25);
        }

        // if //Проверка дали може да получи някоя от стипендиите
        // else if //Проверка коя стипендия е по-голяма и коя ще получи
        if (socialSchol == 0 && excellSchol == 0) {
            System.out.println("You cannot get a scholarship!");
        } else if (socialSchol > excellSchol) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialSchol);
        } else if (excellSchol >= socialSchol) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellSchol);
        }


    }
}
