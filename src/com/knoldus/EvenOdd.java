package com.knoldus;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a number to check, even and odd : ");
        int number = scan.nextInt();
        getEvenOdd(number);

    }
    public static void getEvenOdd (int number) {
        if(number%2 == 0){
            System.out.println("Even Number.");
        } else {
            System.out.println("Odd number");
        }
    }
}
