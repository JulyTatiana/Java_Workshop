package com.exercise9;

import java.util.Scanner;

public class ExerciseNine {

    public void replaceString() {
        Scanner entry = new Scanner(System.in);
        System.out.print("La sonrisa sera la mejor arma contra la tristeza");
        System.out.print("\nPlease enter a sentence to join it with the previous sentence: ");
        String text = entry.nextLine();
        String oldPhrase = "La sonrisa sera la mejor arma contra la tristeza. ";
        String newPhrase = oldPhrase.replace("a", "e");
        System.out.println(newPhrase + text);
    }
}
