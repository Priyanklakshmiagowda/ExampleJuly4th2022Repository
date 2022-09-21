package com.sgtesting.practiceprograms;

public class ForDouble 
{

	public static void main(String[] args) 
	{
	    double d[][]={{12.15d,13.14d,14.13d},{15.12d,16.11d,17.11d}};
	    for(int i=d.length-1;i>=0;i--)
	    {
	    	for(int j=d[i].length-1;j>=0;j--)
	    	{
	    		System.out.print(d[i][j]+" ");
	    	}
	    	System.out.println();
	    		
	    }

	}

}
