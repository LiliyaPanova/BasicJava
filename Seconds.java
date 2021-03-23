package Labs;

import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int first = Integer.parseInt(console.next());
        int second = Integer.parseInt(console.next());
        int third = Integer.parseInt(console.next());

        int timeInSeconds = first + second + third;
        int minutes = timeInSeconds / 60;
        int seconds = timeInSeconds % 60;

        //Проверка за водеща нула

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }


    }
}
