package com.exercise2;

import java.util.*;
class UserInputDemo
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number: ");
        int a= sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();

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


