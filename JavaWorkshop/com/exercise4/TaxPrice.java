package com.exercise4;

import java.util.Locale;
import java.util.Scanner;
public class TaxPrice {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Please enter a tax free price: ");
        double p= price.nextDouble();
        double IVA= 0.21;
        double taxPrice= p*(1+IVA);
        System.out.println("The tax price is: " + taxPrice);
    }
}