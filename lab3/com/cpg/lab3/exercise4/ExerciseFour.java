package com.cpg.lab3.exercise4;
import java.util.*;
public class ExerciseFour {
	static void getOccuringChar(String inputString) 
    { 
        int count[] = new int[256]; 
        int stringLength = inputString.length(); 
        for (int index = 0; index <  stringLength; index++) 
            count[inputString.charAt(index)]++; 
  
        char ch[] = new char[inputString.length()]; 
        for (int index = 0; index <  stringLength; index++) { 
            ch[index] = inputString.charAt(index); 
            int find = 0; 
            for (int compareIndex= 0; compareIndex <= index; compareIndex++) { 
  
       
            	if (inputString.charAt(index) == ch[compareIndex])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                inputString.charAt(index) + " is:" + count[inputString.charAt(index)]);             
        } 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        String inputString = "hello world"; 
        getOccuringChar(inputString);
        sc.close();
    } 
}
