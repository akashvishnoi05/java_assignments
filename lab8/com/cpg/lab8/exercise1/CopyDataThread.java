/**
 * 
 */
package com.cpg.lab8.exercise1;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author viki
 *
 */
public class CopyDataThread extends Thread {
	
	   private String threadName;
	   
	   CopyDataThread( String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   public void run() {
		   int chh=0;
		   char ch = 0;
		      System.out.println("Running " +  threadName );
		      try {
		    	  FileInputStream f=new FileInputStream("source.txt");
		    	  FileWriter writer = new FileWriter("target.txt");
	                System.out.println("\nContents of the file are");
	                int n=f.available();
	                String j = null;
					System.out.print(j+": ");
	                for(int i=0;i<n;i++)
	                {
	                			while(ch!=0) {
	                             ch=(char)f.read();
	                             chh++;
	                             if(chh == 10)
	                             {
	                            	 System.out.println("10 Characters read and going to copy in target.txt");
	                            	 Thread.sleep(1000000);
	                             }
	                             writer.write(ch);
	                             
	                             
	                            
	                            
	                       
	                                       
	                }
	                f.close();
	                writer.close();
		    	  	
		            Thread.sleep(50);
		         }
		      } catch (InterruptedException e) {
		         System.out.println("Thread " +  threadName + " interrupted.");
		      } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      System.out.println("Thread " +  threadName + " exiting.");
		   }
	

}
