package com.exercise12;

import java.util.Scanner;

public class exerciseTwelve {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word1, word2;
        String outcome;
        System.out.println("Write a first word: ");
        word1 = input.nextLine().toLowerCase();
        System.out.println("Write a second word to compare: ");
        word2 = input.nextLine().toLowerCase();
        outcome = "The words are the same";
        if (!word1.contentEquals(word2)){
            outcome = "The different letter between they are: ".concat(comparison(word1, word2));
        }
        System.out.println(outcome);
 }
    static String comparison(String word1, String word2){
        String string1 = word1;
        String string2 = word2;
        System.out.println("Length -> word #1: " + word1.length() + ", word #2: " + word2.length());

        if(word1.length() >= word2.length()){
            string1 = word2;
            string2 = word1;
        }
        String[] comparisonMethod = string1.split("");

        for (String character: comparisonMethod){
            string2 = string2.replaceFirst(character, ",");
        }
        return string2;
    }


}