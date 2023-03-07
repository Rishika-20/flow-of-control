package com.knoldus.primeornot;
import java.util.Scanner;
//To check a number is prime or not.
public class NumberIsPrimeOrNot {
        public void isPrime(int Number) {
            int numbercount = 1;
            int value = 0;

            do {
                if ((Number != 2) && (Number % numbercount == 0)) {
                    value++;
                }
                numbercount++;
            } while (numbercount <= Number);
            if (value > 2) {
                System.out.println("Not a prime number.");
            } else {
                System.out.println("Prime number.");
            }
        }
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number to check prime or not.");
            int inputNumber = scan.nextInt();
            NumberIsPrimeOrNot checkprime = new NumberIsPrimeOrNot();
            checkprime.isPrime(inputNumber);
        }
    }


