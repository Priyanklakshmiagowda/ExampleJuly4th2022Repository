package com.sgtesting.inheritance;
class Family1a
{
	void grandfather(String fname, String lname)
	{
		System.out.println(" name:"+fname+lname);
		
	}
}
class Family1b extends Family1a
{
	void father(String fname, String lname)
	{
		System.out.println(" name:"+fname+lname);
	}
}
class Family1c extends Family1a
{
	void daughter(String fname, String lname)
	{
		System.out.println(" name:"+fname+lname);
	}
}
class Family1d extends Family1a
{
	void grandDaughter(String fname, String lname)
	{
		System.out.println(" name:"+fname+lname);
	}
}


public class HiraricalInheritanceDemo 
{

	public static void main(String[] args) 
	{
		Family1b o1=new Family1b();
		o1.grandfather("Kare", "Rangappa");
		o1.father("Lakshmi", "Narasimahai");
		Family1c o2=new Family1c();
		o2.grandfather("Kare", "Rangappa");
		o2.daughter("Devika", "Rani");
		Family1d o3=new Family1d();
		o3.grandfather("Kare", "Rangappa");
		o3.grandDaughter("Arvi","Gowda");
		

	}

}

