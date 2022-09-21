package com.sgtesting.practiceprograms;

public class DoWhileDouble
{

	public static void main(String[] args) 
	{
		double d[][]= {{12.15d,13.14d,14.13d},{15.12d,16.11d,17.11d}};
		int i=d.length-1;
		do
		{
			int j=d[i].length-1;
			do
			{
				System.out.print(d[i][j]+" ");
				j--;
			}while(j>=0);
			System.out.println();
			i--;
		}while(i>=0);
		

	}

}