package com.exercise3;

import java.util.Scanner;

public class ExerciseThree {
    public void area() {
        Scanner entry = new Scanner(System.in);
        final double Pi = 3.1416;
        System.out.print("Please enter the radius: ");
        double radius = entry.nextDouble();
        System.out.println("The area of the circle is " + Pi * Math.pow(radius,2));
    }
}
