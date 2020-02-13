package com.cpg.lab6.exercise4;

import java.util.Scanner;
public class MainClass {
	 public static void main(String args[])
     {
                 
                 Scanner scr=new Scanner(System.in);
                 System.out.print("\nEnter  String: ");
                 String input=scr.next();
                 AlterString obj = new AlterString();
                 System.out.println(obj.alterString(input));
                 scr.close();

}}
