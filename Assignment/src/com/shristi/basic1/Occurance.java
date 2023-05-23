package com.shristi.basic1;

public class Occurance {
public static void main(String[] args) {
	String s ="Raash";
	char a[]=s.toCharArray();
	int fr[]=new int[a.length];
	for(int i=0;i<a.length;i++)
		
	{
		int count =1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				fr[j]=-1;
			}
		}
		if(fr[i]!=-1)
			fr[i]=count;
		
	}
	for(int i=0;i<a.length;i++)
	{
		if(fr[i]!=-1)
			System.out.println(a[i]+"------>"+fr[i]); 
	}
}
}
