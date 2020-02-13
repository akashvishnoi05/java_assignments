package com.cpg.lab5.exercise2;
import java.util.*;
public class ExerciseTwo {
	public static void main(String args[ ]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value :");
		 int number=input.nextInt();
		System.out.println(nonRecursion(number));
		
		Fabonaci ob=new Fabonaci();
		System.out.println("recursion fabonaci series of number:"+number);
		int value=0;
		for(int index=1;index<=number;index++) {
			value=ob.recursionFabonacci(index);
			System.out.print(" "+value);
		}
		
	input.close();
	}
		
		static int nonRecursion(int number) {
		int index,firstValue=1,secondValue=1,value=0;
		System.out.println("Non -recursion fabonaci series of number:"+number);
		System.out.print(firstValue);
		System.out.print(" "+secondValue);
		for(index=0;index<number-2;index++) {
			value=+firstValue + secondValue;
			firstValue=secondValue;
			secondValue=value;
			System.out.print(" "+value);
		}
		System.out.println();
		//System.out.print(number+"th value of the series is: "+value);
		return value;
	}
		
}
class Fabonaci {
	int recursionFabonacci(int number) {
		if(number==1)
			return (1);
		else if(number==2)
			return (1);
		else
			return (recursionFabonacci(number-1)+recursionFabonacci(number-2));
	}
}