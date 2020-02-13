package com.cpg.lab6.exercise7;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileDemo {
	

	public void fileDemo(String fname) throws IOException {
		// TODO Auto-generated method stub
		 //pass the filename or directory name to File object 
    // Creating a file     
		 File f = new File(fname);
		 if (f.createNewFile()) {
	            System.out.println("File created: " + f.getName());
	          } else {
	            System.out.println("File already exists.");
	          }
	// Creating file function 
		 
        //apply File class methods on File object 
        System.out.println("File name :"+f.getName()); 
        System.out.println("Path: "+f.getPath()); 
        System.out.println("Absolute path:" +f.getAbsolutePath()); 
        System.out.println("Parent:"+f.getParent()); 
        System.out.println("Exists :"+f.exists()); 
        if(f.exists()) 
        { 
            System.out.println("Is writeable:"+f.canWrite()); 
            System.out.println("Is readable"+f.canRead()); 
            System.out.println("Is a directory:"+f.isDirectory()); 
            System.out.println("File Size in bytes "+f.length()); 
        } 
        
       
		
	} 
}