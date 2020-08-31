package hello;

import java.util.Scanner;

public class repeat {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n= s.nextLine();
		String w=" ";
	     n=n+" ";
	     int i,j,c=0;
	     for(i=0;i<n.length();i++)
	     {
	    	 char ch = n.charAt(i);
	    	 if(ch!=' ')
	    			 w=w+ch;
	    	 else {
	    		 
	    		
	    		 for(j=0;j<w.length()-1;j++)
	    		 {
	    			 if(w.charAt(j)==w.charAt(j+1))
	    			 {
	    				 c=1;
	    				 break;
	    			 }
	    		 }
	    		 if(c==1)
	    		 {
	    			 System.out.println(w);
	    			 c=0;}
	    		 
	    		 w=" ";
	    	 }
	     }
	}}
	
	