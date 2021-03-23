package Labs;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);

        double distance = Double.parseDouble(console.nextLine());
        String imput = (console.nextLine());
        String output = console.nextLine();

        // Преобразуваме всичко в метри
        if (imput.equals("mm")){
            distance = distance / 1000;
        } else if (imput.equals("cm")) {
            distance = distance / 100;
        }

        if (output.equals("mm")){
            distance = distance * 1000;

        } else if (output.equals("cm")){
            distance = distance * 100;
        }

        System. out.printf("%.3f", distance);
    }
}
