package com.sgtesting.noargsconstructor;
class Software
{
	String industrytype;
	String companyname;
	Software()
	{
		industrytype="IT industry";
		companyname="Gowri Software solutions ";
		System.out.println("Industry type:"+industrytype);
		System.out.println("Company name:"+companyname);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		industrytype="IT industry";
		companyname="Business One ";
		System.out.println("Industry type:"+industrytype);
		System.out.println("Company name:"+companyname);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		industrytype="IT industry";
		companyname="Digit Insurance";
		System.out.println("Industry type:"+industrytype);
		System.out.println("Company name:"+companyname);
		System.out.println("++++++++++++++++++++++++++++++++++++");
	}
	
	
}
class Hardware
{
	String industrytype;
	String companytypes;
	Hardware()
	{
		
		industrytype="Non IT industry";
		companytypes="Manufacturing";
		System.out.println("Industry type:"+industrytype);
		System.out.println("Company type:"+companytypes);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		
		industrytype="Non IT industry";
		companytypes="Sales";
		System.out.println("Industry type:"+industrytype);
		System.out.println("Company type:"+companytypes);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		
		industrytype="Non IT industry";
		companytypes="Digital marketing";
		System.out.println("Industry type:"+industrytype);
		System.out.println("Company type:"+companytypes);
	}
	
}
public class InstanceDemo7 
{

	public static void main(String[] args) 
	{
		Software it1=new Software();
		
		
		Software it2=new Software();
		
		
		Software it3=new Software();
		
		
		Hardware nonit1=new Hardware();
		
		
		Hardware nonit2=new Hardware();
		
		
		Hardware nonit3=new Hardware();
		
		
		
	
		
		
		
		

	}

}
