package com.exercise5;

public class ExerciseFive {
    public void numbers() {
        boolean condition = true;
        int x = 1;
        while (condition) {
            if (x % 2 == 0) {
                System.out.println(x + " is an even number");
            }
            if (x % 2 != 0) {
                System.out.println(x + " is an odd number");
            }
            x += 1;
            if (x >= 101) {
                condition = false;
            }
        }
    }
}
