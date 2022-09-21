package com.sgtesting.instanceprograms;

class Fruits

{
	String fruitname;
	String typeoffruit;
}
class Vegetables
{
	String verietiesofvegetable;
	String vegetablesname;
}
class Flowers
{
	String flowersname;
	String flowerscolor;
}
public class InstanceDemo1
{
	
	public static void main(String[] args) 
	{
		Fruits obj1=new Fruits();
		obj1.fruitname="Blueberries";
		obj1.typeoffruit="Fleshy";
		System.out.println("Fruit name:"+obj1.fruitname);
		System.out.println("Type of fruit:"+obj1.typeoffruit);
		System.out.println("+++++++++++++++++++++++++");
		
		Fruits obj2=new Fruits();
		obj2.fruitname="peanut";
		obj2.typeoffruit="Dry";
		System.out.println("Fruit name:"+obj2.fruitname);
		System.out.println("Type of fruit:"+obj2.typeoffruit);
		System.out.println("+++++++++++++++++++++++++");
		
		Vegetables veg=new Vegetables();
		veg.verietiesofvegetable="Leafy green";
		veg.vegetablesname="Spinach";
		System.out.println("Verities of vegetables:"+veg.verietiesofvegetable);
		System.out.println("Vegetabels name:"+ veg.vegetablesname);
		System.out.println("+++++++++++++++++++++++++");
		
		Vegetables veg1=new Vegetables();
		veg1.verietiesofvegetable=" root";
		veg1.vegetablesname="patato";
		System.out.println("Verities of vegetables:"+veg1.verietiesofvegetable);
		System.out.println("Vegetabels name:"+ veg1.vegetablesname);
		System.out.println("+++++++++++++++++++++++++");
		
		Vegetables veg2=new Vegetables();
		veg2.verietiesofvegetable="marrow";
		veg2.vegetablesname="pumpki";
		System.out.println("Verities of vegetables:"+veg2.verietiesofvegetable);
		System.out.println("Vegetabels name:"+ veg2.vegetablesname);
		System.out.println("+++++++++++++++++++++++++");
		
		Flowers petals=new Flowers();
		petals.flowersname="Rose";
		petals.flowerscolor="Red";
		System.out.println("Flowers name:"+petals.flowersname);
		System.out.println("flowers color:"+petals.flowerscolor);
		System.out.println("+++++++++++++++++++++++++");
		
		Flowers petals1=new Flowers();
		petals1.flowersname="Lily";
		petals1.flowerscolor="White";
		System.out.println("Flowers name:"+petals1.flowersname);
		System.out.println("flowers color:"+petals1.flowerscolor);
		System.out.println("+++++++++++++++++++++++++");
		
		Flowers petals2=new Flowers();
		petals2.flowersname="Hibiscus";
		petals2.flowerscolor="Red";
		System.out.println("Flowers name:"+petals2.flowersname);
		System.out.println("flowers color:"+petals2.flowerscolor);
		
		
	}

}
