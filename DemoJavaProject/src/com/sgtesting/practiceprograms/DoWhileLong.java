package com.sgtesting.practiceprograms;

public class DoWhileLong 
{

	public static void main(String[] args) 
	{
	
		long l[][]= {{11123,11124,11125},{11126,11127,11128}};
		int i=0;
		do
		{
			int j=0 ;
			do
			{
				System.out.print(l[i][j]+" ");
				j++;
			}while(j<=l[i].length-1);
			System.out.println();
			i++;
		}while(i<=l.length-1);
	}

}
