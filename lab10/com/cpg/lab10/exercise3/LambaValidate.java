package com.cpg.lab10.exercise3;

import java.util.Scanner;

@FunctionalInterface
interface LambdaFunction {
    boolean lambdaValidate(String name,String password);
}


public class LambaValidate {
   public static void main(String args[]) {
       LambdaFunction myInterface = (name , password) -> {
        if(name.equals("user") && password.equals("user"))
return true;
else
return false;
};


     
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Username:");
       String name = sc.next();
       System.out.println("Enter Password:");
       String password= sc.next();
       System.out.println(" : " + myInterface.lambdaValidate(name , password));
       sc.close();
   }
}