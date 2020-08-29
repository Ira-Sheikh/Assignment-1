package hello;

import java.util.Scanner;

public class comparestring {
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	String n1= sc.nextLine();
	String n2= sc.nextLine();
	if(n1.compareTo(n2)>0)
	{
		System.out.println("n1 comes later");
	}
	else if(n2.compareTo(n1)>0)
	{
		System.out.println("n2 comes later");
	}
	else
		System.out.println("n1 and n2 are same");
	
}
}
