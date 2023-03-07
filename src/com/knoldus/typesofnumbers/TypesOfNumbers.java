package com.knoldus.typesofnumbers;

import java.util.Scanner;
public class TypesOfNumbers {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a number to check, whether it is +ve, -ve and zero : ");
        int number = scan.nextInt();
           typesOfNumbers(number);
    }
    private static void typesOfNumbers(int number) {
        if(number == 0)  {
            System.out.println("Number is Zero.");
        }
        if (number > 0) {
            System.out.println("Number is positive.");
        }
        if (number < 0) {
            System.out.println("Number is negative.");
        }
    }
}
