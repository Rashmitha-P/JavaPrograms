package com.shristi.basic;

public class Pattern3 {

	public static void main(String[] args) {
           int n=4;
           for(int i=1;i<=n;i++) {
        	   for(int j=n;j>=1;j--)
        	   {
        		   if(i>=j)
        			   System.out.print(" *");
        		   else
        			   System.out.print(" ");
        			   
        	   }
        	   System.out.println();
           }

	}

}
