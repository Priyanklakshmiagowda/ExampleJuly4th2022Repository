package com.sgtesting.string;

public class assignment5a 
{

	public static void main(String[] args)
	{
		display();
	
	}
	private static void display()
	{
		
		String bb="program";
		char[] jj=bb.toCharArray();
		for(int i=0;i<=jj.length;i++)
		{
			
			int r=0;
			for(int j=0;j<i;j++)
			{
				System. out.print(jj[r]+" ");
				r++;
			}
			System.out.println();
		}
	}

	

}
