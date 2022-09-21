package com.sgtesting.practiceprograms;

public class WhileDouble 
{

	public static void main(String[] args)
	{
		double d[][]= {{12.55d,13.55d,14.55d},{15.55d,16.55d,17.55d}};
		int i=d.length-1;
		while(i>=0)
		{
			int j=d[i].length-1;
			while(j>=0)
			{
				System.out.print(d[i][j]+" ");
				j--;
			}
			System.out.println();
			i--;
			
		}
	

	}

}
