package com.sgtesting.string;

public class assignment4 {

	public static void main(String[] args) 
	{
		character();
		
	}
	private static void character()
	{
		String pp="Mysore to Bangalore";
		String pp1[]=pp.split(" ");
		String sum=" ";
		for(int i=pp1.length-1;i>=0;i--)
		{
			sum=sum+pp1[i];
		}
		System.out.println(sum );
		
		
		
	}
		

	

}
