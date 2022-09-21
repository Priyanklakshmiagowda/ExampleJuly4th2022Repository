package com.sgtesting.noargsconstructor;
class Twowheelers
{
	String vehiclename;
	long price;
	Twowheelers()
	{
		
		vehiclename="Honda";
		price=80000;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		
		vehiclename="Duke";
		price=150000;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		
		vehiclename="Royal enfield";
		price=150000;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
	}
	
}
class Fourwheelers
{
	String vehiclename;
	long rate;
	Fourwheelers()
	{
		
		vehiclename="Swift";
		rate=120000;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("rate:"+rate);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		
		vehiclename="Ertiga";
		rate=1000000;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("rate:"+rate);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		
		vehiclename="baleno";
		rate=500000;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("rte:"+rate);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
	}
	
}
class Heavyvehicle
{
	String vehiclename;
	long price;
	Heavyvehicle()
	{
		
		vehiclename="tata ace";
		price=2500000;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		
		vehiclename="ASHOK LEYLAND DOST";
		price=3000000;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		
		vehiclename="TATA 407";
		price=3500000;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("price:"+price);
	}
}

public class InstanceDemo3 
{

	public static void main(String[] args) 
	{
		Twowheelers bike1=new Twowheelers();
		
		
		Twowheelers bike2=new Twowheelers();
		
		
		Twowheelers bike3=new Twowheelers();
		
		
		Fourwheelers car1=new Fourwheelers();
		
		
		Fourwheelers car2=new Fourwheelers();
		
		
		Fourwheelers car3=new Fourwheelers();
		
		
		Heavyvehicle truck1=new Heavyvehicle();
		
		
		Heavyvehicle truck2=new Heavyvehicle();
		
		
		Heavyvehicle truck3=new Heavyvehicle();
		
		
		
       
	}

}
