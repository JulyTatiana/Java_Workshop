package com.exercise1;

import java.util.*;
class UserInputDemo
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;

        if (a > b) {
            System.out.println("Number " + a + " is greater than number " + b);
        }
        else if (a < b) {
            System.out.println("Number " + b + " is greater than number " + a);
        }
        else {
            System.out.println("The first number: " + a + " is equal to the second number: " + b);
        }
    }
}