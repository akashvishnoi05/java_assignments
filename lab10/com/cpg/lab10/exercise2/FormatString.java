package com.cpg.lab10.exercise2;
@FunctionalInterface
interface MyInterface {
   String spaceString(String n);
}


public class FormatString {
   public static void main(String args[]) {
       MyInterface myInterface = (str) -> {
           String result = "";
           for (int i = 0; i <str.length() ; i++)
           result += str.charAt(i) + " ";
           return result;
       };
       System.out.println("Lambda = " + myInterface.spaceString("Lambda"));
   }
}