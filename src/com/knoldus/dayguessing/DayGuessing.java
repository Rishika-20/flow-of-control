package com.knoldus.dayguessing;

import java.util.Scanner;

public class DayGuessing {
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a number in between (1 to 7) to find day : ");
        int identifyday = scan.nextInt();
        findingDay(identifyday);

    }
// This function will guess the day from the number given by user.
    private static void findingDay(int identifyday) {
        switch(identifyday)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid number.");
        }
    }
}
