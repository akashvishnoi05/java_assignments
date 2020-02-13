package com.cpg.lab7.exercise3;
import java.util.*; 
public class CollectionsSquare { 
	static void calculateSquare(int[] input) 
	{ 
		HashMap<Integer, Integer> CalculateSq 
			= new HashMap<Integer, Integer>(); 			
		for (int n : input) { 
				CalculateSq.put(n,n*n); 
			} 
		// Printing the charCountMap 
		for (Map.Entry entry : CalculateSq.entrySet()) { 
			System.out.println(entry.getKey() + " : " + entry.getValue()); 
		}
	}
	// Driver Code 
	public static void main(String[] args) 
	{ 
//		int[] input = {4,5,7,8}; 
//		calculateSquare(input); 
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++)
		{
			input[i]=sc.nextInt();
		}
		CollectionsSquare sq=new CollectionsSquare();
		sq.calculateSquare(i);
		
		
		
	} 
}