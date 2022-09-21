package com.sgtesting.practiceprograms;

public class DoWhileLastRow 
{

	public static void main(String[] args)
	{
		int a[][]= {{12,13,14},{15,16,17},{18,19,20}};
		int i=0;
		do
		{
			System.out.print(a[2][i]+" ");
			i++;
		}while(i<=a.length-1);
		System.out.println();

	}

}
