package com.cpg.lab5.exercise5;

public class AgeException {
	int age;
	AgeException(int a)
	{    
	     /*———-Checking Age——————–*/
	     try
	     {
	          if(a>15)
	               age=a;
	          else
	               throw new AgeNotWithInRangeException();
	     }
	     catch(AgeNotWithInRangeException e1)
	     {
	          System.out.println(e1);
	     }
	}
	void display()
	{
	     System.out.println("OK");
	}

}
