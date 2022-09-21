package com.sgtesting.noargsconstructor;

class Fruits

{
	String fruitname;
	String typeoffruit;
	Fruits()
	{
		fruitname="Blueberries";
		typeoffruit="Fleshy";
		System.out.println("Fruit name:"+fruitname);
		System.out.println("Type of fruit:"+typeoffruit);
		System.out.println("+++++++++++++++++++++++++");
		
		fruitname="peanut";
		typeoffruit="Dry";
		System.out.println("Fruit name:"+fruitname);
		System.out.println("Type of fruit:"+typeoffruit);
		System.out.println("+++++++++++++++++++++++++");
		
	}
	
	
}
class Vegetables
{
	String verietiesofvegetable;
	String vegetablesname;
	Vegetables()
	{
		verietiesofvegetable="Leafy green";
		vegetablesname="Spinach";
		System.out.println("Verities of vegetables:"+verietiesofvegetable);
		System.out.println("Vegetabels name:"+ vegetablesname);
		System.out.println("+++++++++++++++++++++++++");
		
		verietiesofvegetable=" root";
		vegetablesname="patato";
		System.out.println("Verities of vegetables:"+verietiesofvegetable);
		System.out.println("Vegetabels name:"+ vegetablesname);
		System.out.println("+++++++++++++++++++++++++");
		
		verietiesofvegetable="marrow";
		vegetablesname="pumpki";
		System.out.println("Verities of vegetables:"+verietiesofvegetable);
		System.out.println("Vegetabels name:"+ vegetablesname);
		System.out.println("+++++++++++++++++++++++++");
		
		
	}
}
class Flowers
{
	String flowersname;
	String flowerscolor;
	Flowers()
	{
		flowersname="Rose";
		flowerscolor="Red";
		System.out.println("Flowers name:"+flowersname);
		System.out.println("flowers color:"+flowerscolor);
		System.out.println("+++++++++++++++++++++++++");
		
		flowersname="Lily";
		flowerscolor="White";
		System.out.println("Flowers name:"+flowersname);
		System.out.println("flowers color:"+flowerscolor);
		System.out.println("+++++++++++++++++++++++++");
		
		flowersname="Hibiscus";
		flowerscolor="Red";
		System.out.println("Flowers name:"+flowersname);
		System.out.println("flowers color:"+flowerscolor);
		
	}
}
public class InstanceDemo1
{
	
	public static void main(String[] args) 
	{
		Fruits obj1=new Fruits();
		
		
		Fruits obj2=new Fruits();
		
		
		Vegetables veg=new Vegetables();
		
		
		Vegetables veg1=new Vegetables();
		
		
		Vegetables veg2=new Vegetables();
		
		
		Flowers petals=new Flowers();
		
		
		Flowers petals1=new Flowers();
		
		
		Flowers petals2=new Flowers();
		
		
		
	}

}
