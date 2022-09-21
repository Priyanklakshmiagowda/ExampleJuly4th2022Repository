package com.sgtesting.parameterized;
class Laptop
{
	String companyname;
	long price;
	Laptop(String cn,long pc)
	{
		companyname=cn;
		price=pc;
		System.out.println("Comapany name:"+companyname);
		System.out.println("Price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
	}
	
}
class Desktop
{
	String companyname;
	int noofdesktop;
	Desktop(String cmp,int nd)
	{
		companyname=cmp;
		noofdesktop=nd;
		System.out.println("Comapany name:"+companyname);
		System.out.println("No of Desktop:"+noofdesktop);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		
		
	}
	
}
class Mobile
{
	String brandname;
	long price;
	Mobile( String bn,long prc)
	{
		
		brandname=bn;
		price=prc;
		System.out.println("Brand name:"+brandname);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		
	}
	
}

public class InstanceDemo2 
{

	public static void main(String[] args) 
	{
		Laptop obj1=new Laptop("Dell",50000);
		
		
		Laptop obj2=new Laptop("HP",58000);
		
		
		Laptop obj3=new Laptop("Lenova",50000);
		
		
		Desktop com1=new Desktop("Acer",10);
		
		
		Desktop com2=new Desktop("Samsung",11);
		
		
		Desktop com3=new Desktop("Entwino",14);
		
		
		Mobile andriod=new Mobile("realme",15000);
		
		
		Mobile andriod1=new Mobile("oppo",12000);
		
		
		Mobile andriod2=new Mobile("Redmi",11300);
		
		
		
		
		
		
	}

}
