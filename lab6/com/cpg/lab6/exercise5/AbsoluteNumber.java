package com.cpg.lab6.exercise5;
public class AbsoluteNumber {
public static int modifyNumber(int n)
{
StringBuffer sb=new StringBuffer();
String s=String.valueOf(n);
char array[]=s.toCharArray();
for(int i=0;i<array.length-1;i++)
{
int a=Math.abs((int)(array[i])-(int)(array[i+1]));
String m=String.valueOf(a);
sb.append(m);

}

String k=String.valueOf(array[array.length-1]);
sb.append(k);
String c1=sb.toString();
int f=Integer.parseInt(c1);
return f;

}

// driver Program
public static void main(String args[])
{
AbsoluteNumber a=new AbsoluteNumber();
System.out.println(a.modifyNumber(45862));
}

}