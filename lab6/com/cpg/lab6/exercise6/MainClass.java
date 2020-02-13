package com.cpg.lab6.exercise6;
import java.io.*;
import java.util.*;
public class MainClass {
	 public static void main(String args[])throws IOException
     {
                 
                 Scanner scr=new Scanner(System.in);
                 System.out.print("\nEnter File name: ");
                 String str=scr.nextLine();
                 CountInFile obj = new CountInFile();
                 obj.countInFile(str);
                 scr.close();
     }
}
