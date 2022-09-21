package com.sgtesting.practiceprograms;

public class ForByte 
{

	public static void main(String[] args) 
	{
	    byte b[][]= {{120,122,123,124},{125,126,127,120}};
	    for(int i=0;i<b.length;i++)
	    {
	    	for(int j=0;j<b[i].length;j++)
	    	{
	    		System.out.print(b[i][j]+" ");
	    	}
	    	System.out.println();
	    	
	    }
	}

}
