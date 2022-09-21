package com.sgtesting.constructormethods;
class Method1
{
	void launch2(char ch[][])
	{
		char a[]=new char[ch.length*ch[0].length];
		int k=0;
		for(int i=0;i<=ch.length-1;i++)
		{
			for(int j=0;j<=ch[i].length-1;j++)
			{
				a[k]=ch[i][j];
				k++;
			}
		}
		for(int m=a.length-1;m>=0;m--)
		{
			System.out.println(a[m]);
		}
	}
}

public class OneDarrayMethods 
{

	public static void main(String[] args)
	{
		Method1 obj1=new Method1();
		char z[][]= {{'a','b','c'},{'d','e','f'}};
		obj1.launch2(z);

	}

}
