package hello;
import java.util.*;
public class substring {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n= sc.nextLine();
		int i,j;
		String t=" ";
		for(i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(ch!=' ')
			{
				t=t+ch;
			}
			else {
			
		System.out.print(Character.toUpperCase(n.charAt(i-1))+" ");
		t="";
			}
		}
		String temp = "";
		for(j=0;j<t.length();j++)
		{
			if (j == 0) 
                temp = temp + Character.toUpperCase(t.charAt(0)); 
  
            
            else
                temp = temp + Character.toUpperCase(t.charAt(j)); 
        } 
  
        
        System.out.println(temp); 
    } 
  
		
		
	

}
