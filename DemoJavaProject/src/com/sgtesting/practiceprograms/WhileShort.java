package com.sgtesting.practiceprograms;

public class WhileShort
{
	public static void main(String[] args)
	{
	    short s[][]= {{1010,1011,1013},{1014,1015,1016}};
	    int i=s.length-1;
	    while(i>=0)
	    {
	    	int j=s[i].length-1;
	    	while(j>=0)
	    	{
	    		System.out.print(s[i][j]+" ");
	    		j--;
	    	}
	    	System.out.println();
	    	i--;
	    }

	}

}
