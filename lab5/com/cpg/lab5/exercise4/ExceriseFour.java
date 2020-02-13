package com.cpg.lab5.exercise4;
import java.util.*;
import java.io.*;
public class ExceriseFour {
	public static void main(String args[])throws IOException
    {
        Scanner br = new Scanner(System.in);

        
         System.out.print("\nEnter fIRST name: ");
         String firstName = br.next();
         System.out.print("\nEnter LAST name: ");
         String lastName = br.next();
         NameException obj = new NameException(firstName,lastName);
         obj.display();
         br.close();
    }

}
