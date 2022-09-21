package com.sgtesting.constructor;
class Animals
{
	Animals(String animalname,String animaltype)
	{
		
		System.out.println("Animal name:"+animalname);
		System.out.println("Animal type:"+animaltype);
	}
	Animals(int nooflegs)
	{
		this("Lion","Wildanimal");
		System.out.println("No of legs:"+nooflegs);
	}
	
}
public class ConstructorChainingAnimals 
{
	public static void main(String[] args)
	{
		Animals obj1=new Animals(4);
	}

}
