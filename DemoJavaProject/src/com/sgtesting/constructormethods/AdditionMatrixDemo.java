package com.sgtesting.constructormethods;
class AddMatrix
{
	int[][] addmat(int a[][],int b[][])
	{
		
		int c[][]=new int[3][3];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				c[i][j]=(a[i][j]+b[i][j]);	
			}
		}
		return c;
			
	}
}
public class AdditionMatrixDemo 
{

	public static void main(String[] args) 
	{
		AddMatrix o5=new AddMatrix();
		int a[][]= {{12,13,14},{15,16,17},{18,19,20}};
		int b[][]= {{22,23,24},{25,26,27},{28,29,30}};
		int c[][]=o5.addmat(a,b);
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<c[x].length;y++)
			{
				System.out.print(c[x][y]+" ");
			}
			System.out.println();
		}
		
		

	}

}
