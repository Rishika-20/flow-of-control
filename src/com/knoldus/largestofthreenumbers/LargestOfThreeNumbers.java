package com.knoldus.largestofthreenumbers;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the three number to find max : ");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
        int maxOfThree;

        maxOfThree = (firstNumber > thirdNumber) ? (firstNumber > secondNumber ? firstNumber : thirdNumber) : (secondNumber > thirdNumber ? secondNumber : thirdNumber);
        System.out.println("Maximum of three numbers is "+maxOfThree);
    }
}
