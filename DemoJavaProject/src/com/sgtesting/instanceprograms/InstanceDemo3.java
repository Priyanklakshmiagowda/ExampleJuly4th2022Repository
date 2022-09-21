package com.sgtesting.instanceprograms;
class Twowheelers
{
	String vehiclename;
	long price;
	
}
class Fourwheelers
{
	String vehiclename;
	long rate;
	
}
class Heavyvehicle
{
	String vehiclename;
	long price;
}

public class InstanceDemo3 
{

	public static void main(String[] args) 
	{
		Twowheelers bike1=new Twowheelers();
		bike1.vehiclename="Honda";
		bike1.price=80000;
		System.out.println("vehicle name:"+bike1.vehiclename);
		System.out.println("price:"+bike1.price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		Twowheelers bike2=new Twowheelers();
		bike2.vehiclename="Duke";
		bike2.price=150000;
		System.out.println("vehicle name:"+bike2.vehiclename);
		System.out.println("price:"+bike2.price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		Twowheelers bike3=new Twowheelers();
		bike3.vehiclename="Royal enfield";
		bike3.price=150000;
		System.out.println("vehicle name:"+bike3.vehiclename);
		System.out.println("price:"+bike3.price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		Fourwheelers car1=new Fourwheelers();
		car1.vehiclename="Swift";
		car1.rate=120000;
		System.out.println("vehicle name:"+car1.vehiclename);
		System.out.println("rate:"+car1.rate);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		Fourwheelers car2=new Fourwheelers();
		car2.vehiclename="Ertiga";
		car2.rate=1000000;
		System.out.println("vehicle name:"+car2.vehiclename);
		System.out.println("rate:"+car2.rate);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		Fourwheelers car3=new Fourwheelers();
		car3.vehiclename="baleno";
		car3.rate=500000;
		System.out.println("vehicle name:"+car3.vehiclename);
		System.out.println("rte:"+car3.rate);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		Heavyvehicle truck1=new Heavyvehicle();
		truck1.vehiclename="tata ace";
		truck1.price=2500000;
		System.out.println("vehicle name:"+truck1.vehiclename);
		System.out.println("price:"+truck1.price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		Heavyvehicle truck2=new Heavyvehicle();
		truck2.vehiclename="ASHOK LEYLAND DOST";
		truck2.price=3000000;
		System.out.println("vehicle name:"+truck2.vehiclename);
		System.out.println("price:"+truck2.price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		Heavyvehicle truck3=new Heavyvehicle();
		truck3.vehiclename="TATA 407";
		truck3.price=3500000;
		System.out.println("vehicle name:"+truck3.vehiclename);
		System.out.println("price:"+truck3.price);
		
		
       
	}

}
