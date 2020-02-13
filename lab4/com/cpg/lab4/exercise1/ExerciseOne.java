package com.cpg.lab4.exercise1;

import java.util.Scanner;

public class ExerciseOne {
	public static void main(String args[]){
	    int input;
	    

	    //read the number
	    System.out.println("Enter a Number");
	    Scanner console = new Scanner(System.in);
	    input= Integer.parseInt(console.nextLine());
	    System.out.println(digitOfCube(input));
	    console.close();
	}

	    static int digitOfCube(int input) {
	    int number = input; //number is a temp variable
	    int counter = 0; //counter is used to count no of digits
	    int sum=0;

	    while(number>0){
	        int temp= number%10;
	        sum+=temp*temp*temp;
	        counter = counter+1;
	        number = number/10;
	    }
	    return sum;
	    }

}
