package com.cpg.lab6.exercise1;
import java.util.*;
class SumToken
{
	
                       public void tokenzier(StringTokenizer token) {
                       int dig=0,sum=0;
                       
                       System.out.println("\nEntered digits are : ");
                       while(token.hasMoreTokens())
                       {
                                   String s=token.nextToken();
                                   dig=Integer.parseInt(s);
                                   System.out.print(dig+" ");
                                   sum=sum+dig;
                       }
                       System.out.println();
                       System.out.println("Sum is : "+sum);
           }
}