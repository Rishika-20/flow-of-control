package com.knoldus.studentgrade;

import java.util.Scanner;

public class StudentGrade {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a percentage to calculate grade: ");
        double percentage = scan.nextDouble();
        calculateStudentGrade(percentage);
    }

    public static void calculateStudentGrade(double percentage) {
        if(percentage <= 100 ){
            if(percentage > 90 && percentage <= 100) {
                System.out.println("A+");
            }
            if(percentage > 80 && percentage <= 90) {
                System.out.println("A");
            }
            if(percentage > 70 && percentage <= 80) {
                System.out.println("B");
            }
            if(percentage > 60 && percentage <= 70) {
                System.out.println("C");
            }
            if(percentage > 50 && percentage <= 60) {
                System.out.println("D");
            }
            else{
                System.out.println("Low grade.");
            }
        }
        else{
            System.out.println("Invalid input.");
        }
    }
}
