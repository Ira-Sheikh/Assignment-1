package hello;

import java.util.Scanner;

public class replace {
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		String n1= sc.nextLine();
		String t="";
		t=n1.replace("15 August","26 January");
		t=t.replace("Independence day", "Republic day");
		System.out.println(t);
	}
}
