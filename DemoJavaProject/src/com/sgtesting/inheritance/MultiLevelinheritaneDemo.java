package com.sgtesting.inheritance;
class Family2a
{
	Family2a(String name)
	{
		System.out.println("Family Name:"+name);
	}
}
class Familya3 extends Family2a
{
	Familya3(String name)
	{
		super(name);
	}
}
class Family4 extends Familya3
{
	Family4(String name)
	{
		super(name);
	}
}
class Family5 extends Family4
{
	Family5(String name)
	{
		super(name);
	}
}
public class MultiLevelinheritaneDemo {

	public static void main(String[] args) {
		Family5 o4=new Family5("Halli Mestru");

	}

}
