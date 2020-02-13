package com.cpg.lab6.exercise10;


class Validate {
	public boolean validate(String s)
	{
		if(s.endsWith("_job")&& s.length()>11)
		{
			return true;
		}
		return false;
	}
		
}

public class ValidateMain {

	public static void main(String[] args) {
		
		Validate v=new Validate();
		System.out.println(v.validate("NaraSimha_job"));
		System.out.println(v.validate("Rajesh_job"));

	}

}
