package com.sgtesting.practiceprograms;

public class DoWhileString
{

	public static void main(String[] args) 
	{
		String read[][]={{"Kannada","English","Hindi"},{"Maths","Science","Social"}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(read[i][j]+" ");
			    j++;
			}while(j<=read[i].length-1);
			System.out.println();
			i++;
		}while(i<=read.length-1);
	}

}
