package hello;

import java.util.Scanner;

public class beginvowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1= sc.nextLine();
		String n2= sc.nextLine();
		String n3= sc.nextLine();
		String n4= sc.nextLine();
		String n5= sc.nextLine();
		vowel(n1);
		vowel(n2);
		vowel(n3);
		vowel(n4);
		vowel(n5);
		
		
	}
	public static void vowel(String n) {
			char ch=n.charAt(0);
		
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.println(n+" starts with a vowel");
			}
			
}}
