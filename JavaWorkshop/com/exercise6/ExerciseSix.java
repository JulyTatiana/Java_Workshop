package com.exercise6;

public class ExerciseSix {

    public void numbers() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            }
            if (i % 2 == 1) {
                System.out.println(i + " is an odd number");
            }
        }
    }
}
