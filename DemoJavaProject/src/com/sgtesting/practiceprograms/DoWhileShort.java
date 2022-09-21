package com.sgtesting.practiceprograms;

public class DoWhileShort 
{

	public static void main(String[] args) 
	{
	    short s[][]= {{1050,1051,1052},{1053,1054,1055}};
	    int i=s.length-1;
	    do
	    {
	    	int j=s[i].length-1;
	    	do
	    	{
	    		System.out.print(s[i][j]+" ");
	    		j--;
	    	}while(j>=0);
	    	System.out.println();
	    	i--;
	    }while(i>=0);
	    

	}

}
