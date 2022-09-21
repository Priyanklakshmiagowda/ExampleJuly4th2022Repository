package com.sgtesting.instanceprograms;
class Software
{
	String industrytype;
	String companyname;
	
	
}
class Hardware
{
	String industrytype;
	String companytypes;
	
}
public class InstanceDemo7 
{

	public static void main(String[] args) 
	{
		Software it1=new Software();
		it1.industrytype="IT industry";
		it1.companyname="Gowri Software solutions ";
		System.out.println("Industry type:"+it1.industrytype);
		System.out.println("Company name:"+it1.companyname);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		Software it2=new Software();
		it2.industrytype="IT industry";
		it2.companyname="Business One ";
		System.out.println("Industry type:"+it2.industrytype);
		System.out.println("Company name:"+it2.companyname);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		Software it3=new Software();
		it3.industrytype="IT industry";
		it3.companyname="Digit Insurance";
		System.out.println("Industry type:"+it3.industrytype);
		System.out.println("Company name:"+it3.companyname);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		Hardware nonit1=new Hardware();
		nonit1.industrytype="Non IT industry";
		nonit1.companytypes="Manufacturing";
		System.out.println("Industry type:"+nonit1.industrytype);
		System.out.println("Company type:"+nonit1.companytypes);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		Hardware nonit2=new Hardware();
		nonit2.industrytype="Non IT industry";
		nonit2.companytypes="Sales";
		System.out.println("Industry type:"+nonit2.industrytype);
		System.out.println("Company type:"+nonit2.companytypes);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		Hardware nonit3=new Hardware();
		nonit3.industrytype="Non IT industry";
		nonit3.companytypes="Digital marketing";
		System.out.println("Industry type:"+nonit3.industrytype);
		System.out.println("Company type:"+nonit3.companytypes);
		
		
	
		
		
		
		

	}

}
