package com.sgtesting.Interface;
interface state4
{
    String statename = "karanataka";
	void showstatename();
}
interface districts4 extends state4
{
	  String districtname = "tumkur";
     void showdistrictsname();
	
}
class india9 implements districts4
{
	public void showstatename()
	{
		System.out.println("State name:"+statename);
	}
	public void showdistrictsname()
	{
		System.out.println("State name:"+districtname);
	}
	String address="bangalore";
	void address()
	{
		System.out.println("Adress:"+address);
	}
	
	
}

public class VariableinterfaceDemo 
{

	public static void main(String[] args) 
	{
		india9 ll=new india9();
		ll.showstatename();
		ll.showdistrictsname();
		ll.address();

	}

}
