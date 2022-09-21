package com.sgtesting.constructormethods;
class Method
{
	void launch(char ch[][])
	{
		
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch[i].length-1;j>=0;j--)
			{
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
	}
}
public class TwoDCharMethod 
{

	public static void main(String[] args) 
	{
		Method obj1=new Method();
		char ch[][]={{'a','b','c','d'},{'e','f','g','h'}};
		obj1.launch(ch);

	}

}
