package com.sgtesting.instanceprograms;
class Laptop
{
	String companyname;
	long price;
	
}
class Desktop
{
	String companyname;
	int noofdesktop;
	
}
class Mobile
{
	String brandname;
	long price;
	
}

public class InstanceDemo2 
{

	public static void main(String[] args) 
	{
		Laptop obj1=new Laptop();
		obj1.companyname="Dell";
		obj1.price=50000;
		System.out.println("Comapany name:"+obj1.companyname);
		System.out.println("Price:"+obj1.price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Laptop obj2=new Laptop();
		obj2.companyname="HP";
		obj2.price=58000;
		System.out.println("Comapany name:"+obj2.companyname);
		System.out.println("Price:"+obj2.price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Laptop obj3=new Laptop();
		obj3.companyname="Lenova";
		obj3.price=50000;
		System.out.println("Comapany name:"+obj3.companyname);
		System.out.println("Price:"+obj3.price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Desktop com1=new Desktop();
		com1.companyname="Acer";
		com1.noofdesktop=10;
		System.out.println("Comapany name:"+com1.companyname);
		System.out.println("No of Desktop:"+com1.noofdesktop);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Desktop com2=new Desktop();
		com2.companyname="Samsung";
		com2.noofdesktop=11;
		System.out.println("Comapany name:"+com2.companyname);
		System.out.println("No of Desktop:"+com2.noofdesktop);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Desktop com3=new Desktop();
		com3.companyname="Entwino";
		com3.noofdesktop=14;
		System.out.println("Comapany name:"+com3.companyname);
		System.out.println("No of Desktop:"+com3.noofdesktop);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Mobile andriod=new Mobile();
		andriod.brandname="realme";
		andriod.price=15000;
		System.out.println("Brand name:"+andriod.brandname);
		System.out.println("price:"+andriod.price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Mobile andriod1=new Mobile();
		andriod1.brandname="oppo";
		andriod1.price=12000;
		System.out.println("Brand name:"+andriod1.brandname);
		System.out.println("price:"+andriod1.price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Mobile andriod2=new Mobile();
		andriod2.brandname="Redmi";
		andriod2.price=11300;
		System.out.println("Brand name:"+andriod2.brandname);
		System.out.println("price:"+andriod2.price);
		
		
		
		
		
	}

}
