package com.sgtesting.practiceprograms;

public class ForChar 
{

	public static void main(String[] args) 
	{
		char ch[][]={{'A','B','C','D'},{'E','F','G','H'}};
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch[i].length-1;j>=0;j--)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
