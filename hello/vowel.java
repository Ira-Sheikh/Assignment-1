package hello;

import java.util.Scanner;

public class vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n= sc.nextLine();
		int i,c=0;
		for(i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
		
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				c++;
			}
		}
		System.out.print(c);
	}

}
