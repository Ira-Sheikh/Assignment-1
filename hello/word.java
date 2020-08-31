package hello;

import java.util.Scanner;

public class word {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n= s.nextLine();
		int i;
		String t=" ";
		for(i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			t=t+ch;
			if(ch==' ')
			{
				int x=t.length();
				if(x>5)
					System.out.println("Word greater than 5:"+t);
				t=" ";
			}
			
		}

}}
