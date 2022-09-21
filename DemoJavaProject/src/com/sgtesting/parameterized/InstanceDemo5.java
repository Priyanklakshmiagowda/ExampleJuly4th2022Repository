package com.sgtesting.parameterized;
class Country
{
	String countryname;
	String capitalcity;
	Country(String cn,String cc)
	{
		
		countryname=cn;
		capitalcity=cc;
		System.out.println("Country name:"+countryname);
		System.out.println("Capital City:"+ capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
	
	}
}
class State
{
	String statename;
	String capitalcity;
	State(String sn,String cc)
	{
		
		statename=sn;
		capitalcity=cc;
		System.out.println("State name:"+statename);
		System.out.println("Capital City:"+ capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		
	}
}
class Village
{
	String villagename;
	String district;
	Village(String vn,String dist)
	{
		
		villagename=vn;
		district=dist;
		System.out.println("Village name:"+villagename);
		System.out.println("District:"+ district);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		
	}
	
	
}

public class InstanceDemo5
{

	public static void main(String[] args)
	{
		Country name1=new Country("India","Delhi");
		
		
		Country name2=new Country("Japan","Tokyo");
		
		
		Country name3=new Country("China","Beijing");
		
		
		State cap1=new State("Karnataka","Bangalore");
		
		
		State cap2=new State("Uttar prades","Lucknow");
		
		
		State cap3=new State("Kerala","Thiruvananthapuram");
		
		
		Village city1=new Village("Thimmanahalli","Tumkur");
		
		
		Village city2=new Village("Kugrahma Sindhanur"," Raichur");
		
		
		Village city3=new Village("Bhadravathi","  Shivamogga");
		
		
		
			

	}

}
