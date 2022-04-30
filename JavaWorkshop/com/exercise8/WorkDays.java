package com.exercise8;

import java.util.Scanner;

public class WorkDays {

    public void workDay() {
        Scanner entry = new Scanner(System.in);
        int option;
        System.out.println("\nPlease select one day of the week and enter its number in order to know if you have or not to work \n"
        + "1-Monday, 2-Thuesday, 3-Wednesday, 4-Thursday, 5-Friday, 6-Saturday, 7-Sunday" );
        option = entry.nextInt();

        switch (option) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("You have to work.");
                workDay();
                break;
            case 6:
            case 7:
                System.out.println("Day off!");
                workDay();
                break;
        }
    }

}
