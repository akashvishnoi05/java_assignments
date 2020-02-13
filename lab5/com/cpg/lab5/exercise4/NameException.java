package com.cpg.lab5.exercise4;

public class NameException {
    String firstName;
    String lastName;
   /* NameException()
    {
    	firstName=null;
    	lastName=null;
    }*/
    NameException(String firstNameCheck,String lastNameCheck )
    { 
         /*———-Checking Name——————–*/
         try
         {
        	 if(( firstNameCheck.isEmpty()  && lastNameCheck.isEmpty()))
        		 throw new NameNotValidException();
        	 
         
              else {
            	  firstName=firstNameCheck;
              	  lastName=lastNameCheck;
              }
         }
         catch(NameNotValidException e2)
         {
              System.out.println(e2);
         }
    }
    void display()
    {
         System.out.println(" First LAST");
         System.out.println("---------------------");
         System.out.println(firstName+" "+lastName);
    }

}
