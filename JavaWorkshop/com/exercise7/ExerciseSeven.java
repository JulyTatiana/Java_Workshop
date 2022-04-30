package com.exercise7;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseSeven {

    public void WithDoWhile() {
        Scanner entry = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double number;
        do {
            System.out.print("Please enter a number greater or equal to zero: ");
            number = entry.nextDouble();
        } while (number < 0);
        System.out.println("\nNumber "+number + " is greater than 0.");
    }

}
