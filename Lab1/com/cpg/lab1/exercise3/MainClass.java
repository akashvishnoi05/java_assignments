package com.cpg.lab1.exercise3;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter number: ");
	    int number = scanner.nextInt();
	    ExerciseThree obj = new ExerciseThree();
	    System.out.println(obj.checkNumber(number));
	    scanner.close();

		}

}
