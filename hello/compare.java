package hello;

import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1= sc.nextLine();
		String n2= sc.nextLine();
		int x=n1.compareTo(n2);
		if(x==0)
		System.out.print("n1 and n2 are same");
		else {
			System.out.print("n1 and n2 are not same");
		}
			
}
}