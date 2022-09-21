package com.sgtesting.string;

public class assignment1
{

	public static void main(String[] args) 
	{
		tochararray();
		charAt();
		substring();
		
	}
	private static void tochararray()
	{

		String reversestr="";
		String  str = "priyanka lakshmi gowda";
		char []ch=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			reversestr=reversestr+ch[i];
		}
		System.out.println(reversestr);
		System.out.println("++++++++++++++++++++++++++");
	}
	private static void charAt()
	{
		String gg="priyanka";
		
		for(int i=7;i>=0;i--)
		{
			System.out.print(gg.charAt(i));
		
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		
	}
	private static void substring()
	{
		String dd="priyanka";
		int b=8;
		for(int i=7;i>=0;i--)
		{
			System.out.print(dd.substring(i,b));
			b--;
		}
		System.out.println();
		
		
		
	}

}


