package Labs;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);

        double number = Double.parseDouble(console.nextLine());
        double bonus = 0;

        if (number <= 100){
            bonus = 5;
        } else if (number < 1000) {
            bonus = number * 0.2;
        } else if (number > 1000){
            bonus = number * 0.1;
        }

        if (number % 2 == 0){
            bonus +=1;
        } else if (number % 10 ==5){
            bonus +=2;
        }

        System.out.println(bonus);
        System.out.println(number+bonus);

    	}
}
