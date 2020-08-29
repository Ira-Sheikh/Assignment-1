package hello;

import java.util.Scanner;

public class gender {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n= sc.nextLine();
		int i,index=0;
		String t=" ";
		for(i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(ch==' ')
			{
				index=i;
				break;
			}}
		t=n.substring(0,index);
		if(t.equalsIgnoreCase("Mr.")||t.equalsIgnoreCase("Mr"))
		{
			System.out.println("Male");
			
		}
		else if(t.equalsIgnoreCase("Miss")||t.equalsIgnoreCase("Miss.")|| t.equalsIgnoreCase("Kumari")) {
			System.out.println("Female");
		}
		else if(t.equalsIgnoreCase("Mrs")||t.equalsIgnoreCase("Mrs.")){
			System.out.println("Married Female");
		}
		else
		{
			System.out.println("Cannot be defined");
		}
		}
}
