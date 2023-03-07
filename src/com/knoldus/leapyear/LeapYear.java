package com.knoldus.leapyear;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an year to check whether it is a leap year or not : ");
        int year = scan.nextInt();
        leapYear(year);
    }
    public static void leapYear(int year) {

        if(year % 4 == 0 ) {
            if (year % 400 == 0 || year % 100 != 0) {
                System.out.println("Leap year.");
            }
        }
        else {
                System.out.println("Not a leap year.");
        }
    }

}
