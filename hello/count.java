package hello;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n= sc.nextLine();
		int i,c=0;
	    n=n.trim();
		for(i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(ch==' ')
			{
				c++;
			}}
			System.out.print(c+1);
}}
