package hello;

import java.util.Scanner;

public class frequency {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n= s.nextLine();
		int i,j;
		int[]freq=new int[n.length()];
		char st[]=n.toCharArray();
		
		for(i=0;i<n.length();i++)
		{
			freq[i]=1;
			for(j=i+1;j<n.length();j++)
			{
				if(st[i]==st[j])
				{
					freq[i]++;
					st[j]='0';
				}}}
		for(i=0;i<freq.length;i++)
		{ if(st[i]!=' ' && st[i]!='0')
				System.out.println("Occurence of:"+st[i]+" is "+freq[i]);
			}
				
			
			
			}}
		

