package com.cpg.lab6.exercise4;



public class AlterString {
	
	
	public String alterString(String input) {
	    char[] chars = input.toUpperCase().toCharArray();
	    for (int i = 0; i < chars.length; i++) {
	        char ch = chars[i];
	        if (ch == 'Z')
	            chars[i] = 'B';
	        else if (ch >= 'B' && ch <= 'Y' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
	            ch = (char)(ch + 1);
	            if (ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
	                ch++;
	            chars[i] = ch;
	        }
	    }
	    return new String(chars);
	}

}
