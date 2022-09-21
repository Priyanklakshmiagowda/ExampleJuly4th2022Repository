package com.sgtesting.constructor;
class Mathamatics
{
	Mathamatics(String branches,String fatherofmaths)
	{
		this(99);
		System.out.println("Branches of maths:"+branches);
		System.out.println("Father of maths:"+fatherofmaths);
	}
	Mathamatics(int twodigitno)
	{
		System.out.println("two digit Numbers:"+twodigitno);
	}
	
}
public class ConstructorChainingmaths 
{

	public static void main(String[] args)
	{
		Mathamatics maths1=new Mathamatics("Algebra","Archimedes");
		

	}

}
