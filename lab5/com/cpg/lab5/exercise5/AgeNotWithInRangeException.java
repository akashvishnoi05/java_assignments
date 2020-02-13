package com.cpg.lab5.exercise5;
class AgeNotWithInRangeException extends Exception
{
	
	public String toString()
     {
          return ("Age is not greater than  15 . please ReEnter the Age");
     }
}