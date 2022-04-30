package com.exercise11;

import java.util.Scanner;

public class ExerciseEleven {
    public void counter() {
        Scanner entry = new Scanner(System.in);
        System.out.print("Please write here your sentence: ");
        String sentence = entry.nextLine();
        int vowels = sentence.replaceAll("[^aeiouAEIOUáéíóúÁÉÍÓÚ]","").length();
        System.out.println("The number of vowels in the sentence is " + vowels + " and its lenght is " + sentence.length());
    }
}