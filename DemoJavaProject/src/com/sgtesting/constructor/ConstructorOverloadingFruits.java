package com.sgtesting.constructor;
class Fruits
{
	Fruits(String fruitname,String fruitclr)
	{
		System.out.println("Fruits name:"+fruitname);
		System.out.println("Fruit color:"+fruitclr);
	}
	Fruits(int dozen)
	{
		System.out.println("Dozen:"+dozen);
	}
}
public class ConstructorOverloadingFruits 
{

	public static void main(String[] args) 
	{
		Fruits frt1=new Fruits("Banana","yellow");
		Fruits frt2=new Fruits(6);

	}

}
