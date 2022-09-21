package com.sgtesting.practiceprograms;

public class ForShort
{

	public static void main(String[] args) 
	{
	    short s[][]= {{1000,1001,1002,1003},{1004,1005,1006,1007}};
	    for(int i=s.length-1;i>=0;i--)
	    {
		    for(int j=s[i].length-1;j>=0;j--)
		    {
			    System.out.print(s[i][j]+" ");
		    }
		    System.out.println();
	    }

	}

}
