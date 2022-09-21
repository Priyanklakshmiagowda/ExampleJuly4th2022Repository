package com.sgtesting.noargsconstructor;
class Country
{
	String countryname;
	String capitalcity;
	Country()
	{
		
		countryname="India";
		capitalcity="Delhi";
		System.out.println("Country name:"+countryname);
		System.out.println("Capital City:"+ capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		countryname="Japan";
		capitalcity="Tokyo";
		System.out.println("Country name:"+countryname);
		System.out.println("Capital City:"+ capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		countryname="China";
		capitalcity="Beijing";
		System.out.println("Country name:"+countryname);
		System.out.println("Capital City:"+ capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
	}
}
class State
{
	String statename;
	String capitalcity;
	State()
	{
		
		statename="Karnataka";
		capitalcity="Bangalore";
		System.out.println("State name:"+statename);
		System.out.println("Capital City:"+ capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		statename="Uttar prades";
		capitalcity="Lucknow";
		System.out.println("State name:"+statename);
		System.out.println("Capital City:"+ capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		statename="Kerala";
		capitalcity="Thiruvananthapuram";
		System.out.println("State name:"+statename);
		System.out.println("Capital City:"+ capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
	}
}
class Village
{
	String villagename;
	String district;
	Village()
	{
		
		villagename="Thimmanahalli";
		district="Tumkur";
		System.out.println("Village name:"+villagename);
		System.out.println("District:"+ district);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		villagename="Kugrahma Sindhanur";
		district=" Raichur";
		System.out.println("Village name:"+villagename);
		System.out.println("District:"+ district);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		villagename="Bhadravathi";
		district="  Shivamogga";
		System.out.println("Village name:"+villagename);
		System.out.println("District:"+ district);
	}
	
	
}

public class InstanceDemo5
{

	public static void main(String[] args)
	{
		Country name1=new Country();
		
		
		Country name2=new Country();
		
		
		Country name3=new Country();
		
		
		State cap1=new State();
		
		
		State cap2=new State();
		
		
		State cap3=new State();
		
		
		Village city1=new Village();
		
		
		Village city2=new Village();
		
		
		Village city3=new Village();
		
		
		
			

	}

}
