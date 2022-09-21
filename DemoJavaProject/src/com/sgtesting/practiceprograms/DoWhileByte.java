package com.sgtesting.practiceprograms;

public class DoWhileByte 
{

	public static void main(String[] args)
	{
		byte b[][]= {{99,100,101,102},{103,104,105,106}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(b[i][j]+" ");
				j++;
			}while(j<b[i].length);
		    System.out.println();
			i++;
		}while(i<b.length);
	}

}
