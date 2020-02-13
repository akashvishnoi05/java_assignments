package com.cpg.lab6.exercise2;
import java.io.*;
import java.util.Scanner;

class ReadFile
{
	
    public void lineRead(String str)throws IOException{
    {
                int j=1;
                char ch;
             // File f = new File(str);
              FileInputStream f=new FileInputStream(str);
                System.out.println("\nContents of the file are");
                int n=f.available();
                System.out.print(j+": ");
                for(int i=0;i<n;i++)
                {
                            ch=(char)f.read();
                            System.out.print(ch);
                            if(ch=='\n')
                            {
                                        System.out.print(++j+": ");
                                       
                            }
                                       
                }
                f.close();
    }}}