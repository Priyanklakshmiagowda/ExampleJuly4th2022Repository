package com.sgtesting.practiceprograms;

public class DoWhileChar 
{

	public static void main(String[] args) 
	{
		char ch[][]= {{'M','N','O','P','Q'},{'S','T','O','P','S'}};
		int i=ch.length-1;
		do
		{
			int j=ch[i].length-1;
			do
			{
				System.out.print(ch[i][j]+" ");
				j--;
			}while(j>=0);
			System.out.println();
			i--;
		}while(i>=0);
	}

}
