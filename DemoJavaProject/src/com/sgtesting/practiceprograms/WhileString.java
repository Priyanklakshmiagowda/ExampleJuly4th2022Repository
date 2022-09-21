package com.sgtesting.practiceprograms;

public class WhileString 
{

	public static void main(String[] args) 
	{ 
		String name[][]= {{"Dog","Cat","Monkey"},{"Lion","Tiger","Elephant"}};
		int i=0;
		while(i<=name.length-1)
		{
			int j=0;
			while(j<=name[i].length-1)
			{
				System.out.print(name[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	

	}

}
