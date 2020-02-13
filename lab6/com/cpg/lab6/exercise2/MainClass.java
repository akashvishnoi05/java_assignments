package com.cpg.lab6.exercise2;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {
	 public static void main(String args[])throws IOException
     {
            
                 Scanner scr=new Scanner(System.in);
                 System.out.print("\nEnter File name: ");
                 String str=scr.next();
                 ReadFile obj = new ReadFile();
                 obj.lineRead(str);
          scr.close();

}
}