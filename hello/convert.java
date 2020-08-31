package hello;

import java.util.Scanner;

public class convert {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n= s.nextLine();
		int i;
		String t="";
		
	n= Character.toUpperCase(n.charAt(0))+n.substring(1);
	
		for(i=0;i<n.length();i++)
		{
			
			char ch=n.charAt(i);
			
				
			if(ch==' ')
			{
			
		
			t=t+" "+Character.toUpperCase(n.charAt(i+1));
			i++;
			}
			else {
				
				t=t+ch;
			}
			
		}
		System.out.println(t);
	}
}
