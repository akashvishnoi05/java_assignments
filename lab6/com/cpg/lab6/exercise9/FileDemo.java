package com.cpg.lab6.exercise9;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileDemo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException { 
		Scanner sc= new Scanner(System.in);
        String fname =sc.next(); 
        //pass the filename or directory name to File object 
        File f = new File(fname); 
        if (f.createNewFile()) {
            System.out.println("File created: " + f.getName());
          } else {
            System.out.println("File already exists.");
          }
        long l=f.lastModified();
        Date d=new Date(l);
       
		int date=d.getDate();
        int month=d.getMonth();
        int year=d.getYear();
        int hh=d.getHours();
        int mm=d.getMinutes();
        int ss=d.getSeconds();
        System.out.println(date+"/"+(month+1)+"/"+(1900+year));
        System.out.println(hh+":"+mm+":"+ss);
        sc.close();
        } 
    }