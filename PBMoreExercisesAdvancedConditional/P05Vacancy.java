package PBMoreExercisesAdvancedConditional;

import java.util.Scanner;

public class P05Vacancy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine();

        String place = "";
        String country = "";
        double price = 0.0;

        switch (season) {
			case "Summer":
				country = "Alaska";
				break;
			case "Winter":
				country = "Morocco";
				break;
		}
       if (budget <=1000) {
		   place = "Camp";
       	if (season.equals("Summer")) {
       		price = budget * 0.65;
		} else {
       		price = budget * 0.45;
		}
	   } else if (budget > 1000 && budget <= 3000) {
		   place = "Hut";
		   if (season.equals("Summer")) {
		   	price = budget * 0.80;
		   } else {
		   	price = budget * 0.60;
		   }
	   } else {
       	place = "Hotel";
       	price = budget * 0.90;
	   }
		System.out.printf("%s - %s - %.2f", country, place, price);
    }

}
