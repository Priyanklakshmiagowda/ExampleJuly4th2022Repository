package com.sgtesting.practiceprograms;

public class WhileByte 
{

	public static void main(String[] args) 
	{
		byte b[][]= {{111,112,113,114},{115,116,117,118}};
		int i=0;
		while(i<b.length)
		{
			int j=0;
			while(j<b[i].length)
			{
				System.out.print(b[i][j]+" ");
				j++;	
			}
			System.out.println();
			i++;
		}
		

	}

}
