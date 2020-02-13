package com.cpg.lab5.exercise5;
import java.util.*;
import java.io.*;
public class ExerciseFive {
	public static void main(String args[])throws IOException
    {
        Scanner br = new Scanner(System.in);
         System.out.print("\nEnter age: ");
         int age = br.nextInt();
         AgeException s = new AgeException(age);
         s.display();
         br.close();
    }
}


