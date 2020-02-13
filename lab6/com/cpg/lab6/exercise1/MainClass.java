package com.cpg.lab6.exercise1;

import java.util.*;

public class MainClass {
	public static void main(String args[])
    {
                Scanner scanner=new Scanner(System.in);
System.out.println("\nEnter sequence of integers with space b/w them and press enter : ");
                String digit=scanner.nextLine();
                StringTokenizer token=new StringTokenizer(digit);
                SumToken  obj = new SumToken();
                obj.tokenzier(token);
                scanner.close();

}
}
