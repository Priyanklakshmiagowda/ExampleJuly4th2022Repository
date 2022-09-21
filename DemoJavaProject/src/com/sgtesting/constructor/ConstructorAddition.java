package com.sgtesting.constructor;
class Addition
{
	Addition(int a[][],int b[][])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			
			for(int j=0;j<=a[i].length-1;j++)
			{
				
				int sum=a[i][j]+b[i][j];
				System.out.print(sum+" ");
				
			}
			System.out.println();
		}
	}
}
public class ConstructorAddition 
{
	public static void main(String[] args)
	{
		int a[][]= {{12,13,14},{15,16,17},{18,19,20}};
		int b[][]= {{22,23,24},{25,26,27},{28,29,30}};
		
		new Addition(a,b);
	}

}
