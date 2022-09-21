package com.sgtesting.parameterized;
class Software
{
	String industrytype;
	String companyname;
	Software(String it,String cn)
	{
		industrytype=it;
		companyname=cn;
		System.out.println("Industry type:"+industrytype);
		System.out.println("Company name:"+companyname);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		
	}
	
}
class Hardware
{
	String industrytype;
	String companytypes;
	Hardware(String IT,String ct)
	{
		
		industrytype=IT;
		companytypes=ct;
		System.out.println("Industry type:"+industrytype);
		System.out.println("Company type:"+companytypes);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
	
	}
	
}
public class InstanceDemo7 
{

	public static void main(String[] args) 
	{
		Software it1=new Software("IT industry","Gowri Software solutions ");
		
		
		Software it2=new Software("IT industry","Business One ");
		
		
		Software it3=new Software("IT industry","Digit Insurance");
		
		
		Hardware nonit1=new Hardware("Non IT industry","Manufacturing");
		
		
		Hardware nonit2=new Hardware("Non IT industry","Sales");
		
		
		Hardware nonit3=new Hardware("Non IT industry","Digital marketing");
		
		
		
	
		
		
		
		

	}

}
