package com.sgtesting.parameterized;
class Twowheelers
{
	String vehiclename;
	long price;
	Twowheelers(String vn,long prc)
	{
		
		vehiclename=vn;
		price=prc;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		
	}
	
}
class Fourwheelers
{
	String vehiclename;
	long rate;
	Fourwheelers(String vnc,long rt)
	{
		
		vehiclename=vnc;
		rate=rt;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("rate:"+rate);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
	}
	
}
class Heavyvehicle
{
	String vehiclename;
	long price;
	Heavyvehicle(String vn,long rs)
	{
		
		vehiclename=vn;
		price=rs;
		System.out.println("vehicle name:"+vehiclename);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
	}
}

public class InstanceDemo3 
{

	public static void main(String[] args) 
	{
		Twowheelers bike1=new Twowheelers("Honda",80000);
		
		
		Twowheelers bike2=new Twowheelers("Duke",150000);
		
		
		Twowheelers bike3=new Twowheelers("Royal enfield",150000);
		
		
		Fourwheelers car1=new Fourwheelers("Swift",120000);
		
		
		Fourwheelers car2=new Fourwheelers("Ertiga",1000000);
		
		
		Fourwheelers car3=new Fourwheelers("baleno",500000);
		
		
		Heavyvehicle truck1=new Heavyvehicle("tata ace",2500000);
		
		
		Heavyvehicle truck2=new Heavyvehicle("ASHOK LEYLAND DOST",3000000);
		
		
		Heavyvehicle truck3=new Heavyvehicle("TATA 407",3500000);
		
		
		
       
	}

}
