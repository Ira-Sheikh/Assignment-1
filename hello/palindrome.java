package hello;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n= s.nextLine();
		int i;
		String t="";
	
		for(i=n.length()-1;i>=0;i--)
		{
			
			t=t+n.charAt(i);
		}
		
		
		 if(n.equalsIgnoreCase(t))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }
	    }
	}