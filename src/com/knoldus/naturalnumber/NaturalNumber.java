package com.knoldus.naturalnumber;
//To find the sum of first n natural numbers using a while loop.
import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number count, to print the natural number:");
        int number = scan.nextInt();
        int index = 1;
        while(index <= number) {
            System.out.println(" "+index+" ");
            index++;
        }
    }
}
