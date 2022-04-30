package com.exercise14;

import java.util.Scanner;

public class exerciseFourteen {
    static void numbersUntil1000(int input) {

        while(input <= 1000) {
            System.out.println(input);
            input+=2;
        }
    }
    public static void main(String[] args) {

        System.out.println("Write an integer number minor to 1000");
        Scanner number = new Scanner(System.in);
        String increase = number.nextLine();
        int integerNumber = Integer.parseInt(increase);
        numbersUntil1000(integerNumber);
    }
}