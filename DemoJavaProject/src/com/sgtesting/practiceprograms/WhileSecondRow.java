package com.sgtesting.practiceprograms;

public class WhileSecondRow
{

	public static void main(String[] args) 
	{
		int a[][]= {{12,13,14},{15,16,17},{18,19,20}};
		int i=0;
		while(i<=a.length-1)
		{
			System.out.print(a[2][i]+" ");
			i++;
		}
	    System.out.println();

	}

}
