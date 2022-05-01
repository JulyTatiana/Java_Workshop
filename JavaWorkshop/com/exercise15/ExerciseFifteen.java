package com.exercise15;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExerciseFifteen {

    Scanner number = new Scanner(System.in);

    public int Menu() {
        int choice;
        System.out.print(
                "******** FILM MANAGEMENT ********\n" +
                "1-NEW ACTOR\n" +
                "2-SEARCH ACTOR\n" +
                "3-DELETE ACTOR\n" +
                "4-CHANGE ACTOR\n" +
                "5-WATCH ALL ACTORS\n" +
                "6-WATCH THE ACTORS' FILMS\n" +
                "7-SEE CATEGORY OF THE ACTORS' FILMS\n" +
                "8-EXIT\n");
        choice = number.nextInt();
        if (choice != 8) {
            System.out.print("\nIncorrect option! please select another\n");
        }
        return choice;
    }

    public void chooseOption() {
        try {
            int option = Menu();

            switch (option) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    chooseOption();
                case 8:
                    break;
                default:
                    System.out.print("\nIncorrect option! please select another\n");
                    System.out.print("You have selected option " + option);
                    chooseOption();
            }
        } catch (InputMismatchException e) {
            System.out.println("\nYou should write an integer number! Please execute this program again\n");
            number.nextLine();
        }
    }
}
