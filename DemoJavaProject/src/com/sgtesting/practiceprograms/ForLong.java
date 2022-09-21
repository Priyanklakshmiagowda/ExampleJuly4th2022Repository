package com.sgtesting.practiceprograms;

public class ForLong 
{

	public static void main(String[] args)
	{
		long l[][]= {{22223,33334,44445},{55556,66667,88889}};
		for(int i=0;i<=l.length-1;i++)
		{
			for(int j=0;j<=l[i].length-1;j++)
			{
				System.out.print(l[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
