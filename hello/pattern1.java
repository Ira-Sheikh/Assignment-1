package hello;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n=s.nextLine();
		int i,j;
		for(i=1;i<=n.length();i++)
		{ 
			for(j=1;j<=i;j++)
			{
					System.out.print(n.charAt(j-1));
			}
			System.out.println();
			
		}
			
		}

}
