package hello;

import java.util.Scanner;

public class piglatin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n= sc.nextLine();
		int i,index=-1;
		for(i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
		
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				index=i;
				break;
			}}
			if(index == -1)
				System.out.println("No vowels present");
			else {
				System.out.println(n.substring(index)+n.substring(0,index)+"ay");
				
			}
		}

	}
