package hello;

import java.util.Scanner;

public class student {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		int roll[]=new int[5];
		String name[]=new String[5];
		for(i=0;i<5;i++)
		{
			roll[i]=s.nextInt();
			name[i]=s.nextLine();
			
		}	System.out.println("Roll number\tName");
		for(i=0;i<5;i++) {
	
		System.out.println(roll[i]+"\t\t"+name[i]);
}}}
