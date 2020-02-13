package com.cpg.lab1.exercise2;

public class ExerciseTwo {

	
	public static int calculateDifference(int n){
		int sumN = 0, sumSq = 0, sum = 0;
	for (int index=1; index <= n; index++)
	{
			sumSq+=(index*index);
	}
	for (int index=1; index <= n; index++)
	{
			sumN+=index;
	}
	sum=  sumSq-sumN*sumN;
	return(sum);
	}

}
