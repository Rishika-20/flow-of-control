package com.knoldus.sumofnaturalnumber;
import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number count, to calculate the sum of natural number :");
        int numbercount = scan.nextInt();
        int sum = 0;
        int index =1;
        while(index <= numbercount) {
            sum = sum + index ;
            index ++;
        }
        System.out.println("Sum of natural numbers are: "+sum);
    }
}
