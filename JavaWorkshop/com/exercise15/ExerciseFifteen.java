package com.exercise15;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExerciseFifteen {
    Scanner entry = new Scanner(System.in);
    public int Menu() {
        int choice;
        System.out.print("****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6-VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR\n");
        choice = entry.nextInt();
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
            entry.nextLine();
        }
    }
}
