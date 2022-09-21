package com.sgtesting.parameterized;

class Fruits

{
	String fruitname;
	String typeoffruit;
	Fruits(String fn,String tf)
	{
		fruitname=fn;
		typeoffruit=tf;
		
		System.out.println("Fruit name:"+fruitname);
		System.out.println("Type of fruit:"+typeoffruit);
		System.out.println("+++++++++++++++++++++++++");
		
		
		
	}
	
	
}
class Vegetables
{
	String verietiesofvegetable;
	String vegetablesname;
	Vegetables(String vv,String vn)
	{
		verietiesofvegetable=vv;
		vegetablesname=vn;
		
		System.out.println("Verities of vegetables:"+verietiesofvegetable);
		System.out.println("Vegetabels name:"+ vegetablesname);
		System.out.println("+++++++++++++++++++++++++");
		
	
		
		
	}
}
class Flowers
{
	String flowersname;
	String flowerscolor;
	Flowers(String fn,String fc)
	{
		flowersname=fn;
		flowerscolor=fc;
		System.out.println("Flowers name:"+flowersname);
		System.out.println("flowers color:"+flowerscolor);
		System.out.println("+++++++++++++++++++++++++");
		
		
		
	}
}
public class InstanceDemo1
{
	
	public static void main(String[] args) 
	{
		Fruits obj1=new Fruits("Blueberries","Fleshy" );
		
		
		Fruits obj2=new Fruits("peanut","Dry");
		
		
		Vegetables veg=new Vegetables("Leafy green","Spinach");
		
		
		Vegetables veg1=new Vegetables(" root","patato");
		
		
		Vegetables veg2=new Vegetables("marrow","pumpki");
		
		
		Flowers petals=new Flowers("Rose","Red");
		
		
		Flowers petals1=new Flowers("Lily","White");
		
		
		Flowers petals2=new Flowers("Hibiscus","Red");
		
		
		
	}

}
