package com.cpg.lab6.exercise6;
import java.io.*;

public class CountInFile {
	
	 public void countInFile(String str)throws IOException
     {
                 int newLine=1,newWord=0;           
                 char ch;
                 FileInputStream f=new FileInputStream(str);
                 int newChar=f.available();
                 for(int i=0;i<newChar;i++)
                 {
                             ch=(char)f.read();
                             if(ch=='\n')
                             newLine++;
                             else if(ch==' ')
                                         newWord++;
                                                                
                 }
                 System.out.println("\nNumber of lines : "+newLine);
                 System.out.println("\nNumber of words : "+(newLine+newWord));
                 System.out.println("\nNumber of characters : "+newChar);
                
                 f.close();
     }

}
