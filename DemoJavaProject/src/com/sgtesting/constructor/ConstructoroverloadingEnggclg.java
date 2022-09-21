package com.sgtesting.constructor;
class Engineeringclg
{
	Engineeringclg(String collegename,int clgcode)
	{
		System.out.println("College name:"+collegename);
		System.out.println("College code:"+clgcode);
	}
	Engineeringclg(String clglocation)
	{
		System.out.println("College location:"+clglocation);
		
	}
	
}
public class ConstructoroverloadingEnggclg
{

	public static void main(String[] args) 
	{
		Engineeringclg clg1=new Engineeringclg("BMS College",0002);
		Engineeringclg clg2=new Engineeringclg("Bangalore");
		

	}

}
