package com.exercise10;

import java.util.Scanner;

public class ExerciseTen {

    public void phraseWithoutSpaces() {
        Scanner entry = new Scanner(System.in);
        System.out.print("Please write a sentence: ");
        String oldPhrase = entry.nextLine();
        System.out.print("The sentence without spaces is: ");
        System.out.println(oldPhrase.replaceAll("\\s+",""));
    }
}
