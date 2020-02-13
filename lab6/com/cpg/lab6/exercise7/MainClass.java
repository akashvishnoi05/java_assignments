package com.cpg.lab6.exercise7;
import java.io.IOException;
import java.util.*;
public class MainClass {
	public static void main(String[] args) throws IOException { 
		Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the file name");
        String fname =sc.next(); 
       // File f = new File(fname);
        FileDemo obj = new FileDemo();
       // obj.fileDemo(f);
        obj.fileDemo(fname);
        sc.close();
	}
}
