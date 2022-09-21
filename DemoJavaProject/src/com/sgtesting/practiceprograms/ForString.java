package com.sgtesting.practiceprograms;

public class ForString 
{

	public static void main(String[] args)
	{
		String read[][]={{"Shivu","Rohith","Chandan"},{"Naveen","Karthik","Anurag"}};
		for(int i=0;i<=read.length-1;i++)
		{
			for(int j=0;j<=read[i].length-1;j++)
			{
				System.out.print(read[i][j]+" ");
			}
			System.out.println();
		}
	}

}
