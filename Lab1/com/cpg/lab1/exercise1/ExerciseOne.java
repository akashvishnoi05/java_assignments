package com.cpg.lab1.exercise1;
public class ExerciseOne {
	
	public static int calculateSum(int num){
		int sum =0;
		for (int index=1; index <= num; index++)
		{
			if((index%3==0)||(index%5==0))
				sum+=index;
		}
		
	return sum;
	}
}
