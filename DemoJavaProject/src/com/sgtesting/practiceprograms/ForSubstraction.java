package com.sgtesting.practiceprograms;

public class ForSubstraction 
{

	public static void main(String[] args) 
	{
		int a[][]= {{12,13,14},{15,16,17},{18,19,20}};
		int b[][]= {{22,23,24},{25,26,27},{28,29,30}};
		int c[][]=new int[3][3];
	
		for(int i=0;i<=c.length-1;i++)
		{
			for(int j=0;j<=c[i].length-1;j++)
			{
				c[i][j]=(a[i][j]-b[i][j]);
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
