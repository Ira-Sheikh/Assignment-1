
package hello;
import java.util.*;
public class logic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n= sc.nextLine();
		int i=0;
		
		String t="";
		 System.out.print(n.charAt(0)+".");
		while(i<n.length()) {
		   char ch= n.charAt(i);
		   if(ch==' ') {
			   System.out.print(Character.toUpperCase(n.charAt(i+1))+".");
			   
		   }
		i++;	   
		}
	}
}
