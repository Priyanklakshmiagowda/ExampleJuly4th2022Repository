
package com.sgtesting.parameterized;
class Animals
{
	String animalname;
	String animaltype;
	Animals(String an,String at)
	{
		
		animalname=an;
		animaltype=at;
		System.out.println("animal name:"+animalname);
		System.out.println("Animal type:"+animaltype);
		System.out.println("++++++++++++++++++++++++++++++");
		
	}
	
}
class Birds
{
	String birdname;
	String birdcolor;
	Birds(String bn,String bc)
	{
		
		birdname=bn;
		birdcolor=bc;
		System.out.println("Bird name:"+birdname);
		System.out.println("Bird color:"+birdcolor);
		System.out.println("++++++++++++++++++++++++++++++");
		
		
	}
	
}
class Insects
{
	String insectsname;
	String insectswings;
	Insects(String in,String iw)
	{
		
		insectsname=in;
		insectswings=iw;
		System.out.println("Insects name:"+insectsname);
		System.out.println("Bird color:"+insectswings);
		System.out.println("++++++++++++++++++++++++++++++");
	
	}
	
}

public class InstanceDemo4 
{

	public static void main(String[] args) 
	{
		Animals obj1=new Animals("Cow","Farm animal");
		
		
		Animals obj2=new Animals("Tiger","Wild animal");
		
		
		Animals obj3=new Animals("Goat","Farm animal");
		
		
		Birds var1=new Birds("Crowned Pigeon","blue");
		
		
		Birds var2=new Birds("Gallinule","Purple");
		
		
		Birds var3=new Birds("Love bird","Yellow");
		
		
		Insects name1=new Insects("Dragons","Membranous");
		
		
		
		Insects name2=new Insects("Thrips","Fringed");
		
		
		Insects name3=new Insects("Cockroach","Tegmina");
		
		
		
		
		
				
		

	}

}
