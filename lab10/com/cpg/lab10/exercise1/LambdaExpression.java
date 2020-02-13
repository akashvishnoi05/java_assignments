package com.cpg.lab10.exercise1;

@FunctionalInterface
interface MyFunctionalInterface {

	//A method with single parameter
    public double power(int x, int y);
}


public class LambdaExpression {

   public static void main(String args[]) {
       
    	MyFunctionalInterface f = (x,y) -> Math.pow(x, y);
        System.out.println(f.power(2,5));
    }
}