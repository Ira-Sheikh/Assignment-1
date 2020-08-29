package hello;

import java.util.Scanner;

public class day {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n= sc.nextLine();
		n=n.toUpperCase();
		switch(n)
		{
		case "MONDAY":
			System.out.println(1);
			break;
		case "TUESDAY":
			System.out.println(2);
			break;
		case("WEDNESDAY"):
			System.out.println(3);
		    break;
		case("THURSDAY"):
			System.out.println(4);
		    break;
		case("FRIDAY"):
			System.out.println(5);
		    break;
		case("SATURDAY"):
			System.out.println(6);
		    break;
		case("SUNDAY"):
			System.out.println(7);
		    break;
		   default:
			   System.out.println("Inavlid Case");
			   break;
			
		}

}}
