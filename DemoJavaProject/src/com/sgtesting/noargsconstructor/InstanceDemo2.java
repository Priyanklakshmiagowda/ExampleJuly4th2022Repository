package com.sgtesting.noargsconstructor;
class Laptop
{
	String companyname;
	long price;
	Laptop()
	{
		companyname="Dell";
		price=50000;
		System.out.println("Comapany name:"+companyname);
		System.out.println("Price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		companyname="HP";
		price=58000;
		System.out.println("Comapany name:"+companyname);
		System.out.println("Price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		companyname="Lenova";
		price=50000;
		System.out.println("Comapany name:"+companyname);
		System.out.println("Price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
	}
	
}
class Desktop
{
	String companyname;
	int noofdesktop;
	Desktop()
	{
		companyname="Acer";
		noofdesktop=10;
		System.out.println("Comapany name:"+companyname);
		System.out.println("No of Desktop:"+noofdesktop);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		companyname="Samsung";
		noofdesktop=11;
		System.out.println("Comapany name:"+companyname);
		System.out.println("No of Desktop:"+noofdesktop);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		companyname="Entwino";
		noofdesktop=14;
		System.out.println("Comapany name:"+companyname);
		System.out.println("No of Desktop:"+noofdesktop);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		
	}
	
}
class Mobile
{
	String brandname;
	long price;
	Mobile()
	{
		
		brandname="realme";
		price=15000;
		System.out.println("Brand name:"+brandname);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		
		brandname="oppo";
		price=12000;
		System.out.println("Brand name:"+brandname);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		
		brandname="Redmi";
		price=11300;
		System.out.println("Brand name:"+brandname);
		System.out.println("price:"+price);
		
	}
	
}

public class InstanceDemo2 
{

	public static void main(String[] args) 
	{
		Laptop obj1=new Laptop();
		
		
		Laptop obj2=new Laptop();
		
		
		Laptop obj3=new Laptop();
		
		
		Desktop com1=new Desktop();
		
		
		Desktop com2=new Desktop();
		
		
		Desktop com3=new Desktop();
		
		
		Mobile andriod=new Mobile();
		
		
		Mobile andriod1=new Mobile();
		
		
		Mobile andriod2=new Mobile();
		
		
		
		
		
		
	}

}
