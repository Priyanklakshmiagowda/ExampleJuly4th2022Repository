package com.sgtesting.constructor;
class Transpose
{
	Transpose(int a[][])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println(" ");
		}
	}
}
public class ConstructorTranspose 
{

	public static void main(String[] args) 
	{
		int a[][]= {{12,13,14},{15,16,17},{18,19,20}};
		new Transpose(a);

	}

}
