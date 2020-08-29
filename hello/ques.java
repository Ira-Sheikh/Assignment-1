package hello;

import java.util.Scanner;

public class ques {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n= sc.nextLine();
		int i,c=0;
		for(i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(ch>='A' && ch<='Z')
				c++;
				
			}
		
	
	System.out.print(c);
		

}}
