package com.cpg.lab5.exercise3;

import java.util.Scanner;

public class ExerciseThree {
	public static void main(String[] args)
	{
		int number;
		int counter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		number=sc.nextInt();
		for(int index=2; index<number; index++)
		{
			counter=0;
			for(int indexJ=2;indexJ<index;indexJ++)
			{
				if(index%indexJ==0)
					counter=1;
			}
			if(counter==0)
				System.out.print(" "+index);
		}
	
	sc.close();
	}

}
