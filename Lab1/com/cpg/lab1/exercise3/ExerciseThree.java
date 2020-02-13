package com.cpg.lab1.exercise3;
import java.util.Scanner;

public class ExerciseThree {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter number: ");
	    int number = scanner.nextInt();
	    System.out.println(checkNumber(number));
	    scanner.close();

		}
	public static boolean checkNumber(int number){
    int previousDigit = 9;
    boolean increasingNumber = true;
    while (number > 0) {
        int currentDigit = number % 10;
        number = number / 10;
        if (currentDigit > previousDigit) {
            increasingNumber = false;
            break;
        }
        previousDigit = currentDigit;
    }
    return increasingNumber;
	}
}