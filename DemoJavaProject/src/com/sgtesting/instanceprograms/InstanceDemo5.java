package com.sgtesting.instanceprograms;
class Country
{
	String countryname;
	String capitalcity;
}
class State
{
	String statename;
	String capitalcity;
}
class Village
{
	String villagename;
	String district;
	
	
}

public class InstanceDemo5
{

	public static void main(String[] args)
	{
		Country name1=new Country();
		name1.countryname="India";
		name1.capitalcity="Delhi";
		System.out.println("Country name:"+name1.countryname);
		System.out.println("Capital City:"+ name1.capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Country name2=new Country();
		name2.countryname="Japan";
		name2.capitalcity="Tokyo";
		System.out.println("Country name:"+name2.countryname);
		System.out.println("Capital City:"+ name2.capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Country name3=new Country();
		name3.countryname="China";
		name3.capitalcity="Beijing";
		System.out.println("Country name:"+name3.countryname);
		System.out.println("Capital City:"+ name3.capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		State cap1=new State();
		cap1.statename="Karnataka";
		cap1.capitalcity="Bangalore";
		System.out.println("State name:"+cap1.statename);
		System.out.println("Capital City:"+ cap1.capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		State cap2=new State();
		cap2.statename="Uttar prades";
		cap2.capitalcity="Lucknow";
		System.out.println("State name:"+cap2.statename);
		System.out.println("Capital City:"+ cap2.capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		State cap3=new State();
		cap3.statename="Kerala";
		cap3.capitalcity="Thiruvananthapuram";
		System.out.println("State name:"+cap3.statename);
		System.out.println("Capital City:"+ cap3.capitalcity);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Village city1=new Village();
		city1.villagename="Thimmanahalli";
		city1.district="Tumkur";
		System.out.println("Village name:"+city1.villagename);
		System.out.println("District:"+ city1.district);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Village city2=new Village();
		city2.villagename="Kugrahma Sindhanur";
		city2.district=" Raichur";
		System.out.println("Village name:"+city2.villagename);
		System.out.println("District:"+ city2.district);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Village city3=new Village();
		city3.villagename="Bhadravathi";
		city3.district="  Shivamogga";
		System.out.println("Village name:"+city3.villagename);
		System.out.println("District:"+ city3.district);
		
		
			

	}

}
