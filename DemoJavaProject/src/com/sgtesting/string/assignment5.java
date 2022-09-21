package com.sgtesting.string;

public class assignment5 
{

	public static void main(String[] args) 
	{
		getarray();
	}
	
	private static void getarray()
	{
		
		String ll="program";
		char[] mm=ll.toCharArray();
		for(int i=1;i<=mm.length;i++)
		{
			int k=0;
			for(int j=i;j<=mm.length;j++)
			{
				System.out.print(mm[k]+" ");
				k++;
			}
			System.out.println();
		}
	}
		

	

}
