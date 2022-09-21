package com.sgtesting.constructormethods;
class CharDemo
{
	char [][]demo2()
	{
		char ch[][]= {{'a','b','c'},{'d','e','f'}};
		
		return ch;
	}
}
public class TwoDcharrDemo
{

	public static void main(String[] args)
	{
		CharDemo  o7=new CharDemo();
		char p[][]=o7.demo2();
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				System.out.println(p[i][j]);
			}
		}
		
		
	}

}
