package com.sgtesting.practiceprograms;

public class WhileChar
{

	public static void main(String[] args)
	{
		char ch[][]= {{'X','Y','Z','A'},{'P','Q','R','S'}};
		int i=ch.length-1;
		while(i>=0)
		{
			int j=ch[i].length-1;
			while(j>=0)
			{
				System.out.print(ch[i][j]+" ");
				j--;
			}
			System.out.println();
			i--;
			
		}
		

	}

}
