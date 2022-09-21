package com.sgtesting.string;

public class assignment3 {

	public static void main(String[] args) 
	{
		ispalindrome();
	}
	private static void ispalindrome()
	{
		String stra="DAD";
		String revs="";
		char d[]=stra.toCharArray();
		for(int i=0;i<d.length;i++)	
		{
			revs=(revs+d[i]);
		}
		
		if(stra.equalsIgnoreCase(revs))
		{
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("is not palindrome");
		}
		
		
	}

}
 