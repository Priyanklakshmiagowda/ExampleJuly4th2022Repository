package com.sgtesting.practiceprograms;

public class WhileSubstraction
{

	public static void main(String[] args)
	{
		int a[][]= {{12,13,14},{15,16,17},{18,19,20}};
		int b[][]= {{22,23,24},{25,26,27},{28,29,30}};
		int c[][]=new int[3][3];
		int i=0;
		while(i<=c.length-1)
		{
			int j=0;
			while(j<=c[i].length-1)
			{
				c[i][j]=(a[i][j]-b[i][j]);
				System.out.print(c[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	
	}

}
