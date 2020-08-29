package hello;

import java.util.Scanner;

public class change {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n= sc.nextLine();
		int i;
		String t="";
		for(i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
				t=t+ch;
			}
			else
				if(ch>='a' && ch<='z')
				{
					ch= (char)(ch-32);
					t=t+ch;
				}
				else
					t=t+ch;
}
		System.out.print(t);
	}}
