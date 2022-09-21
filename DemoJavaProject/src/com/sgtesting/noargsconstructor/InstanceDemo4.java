
package com.sgtesting.noargsconstructor;
class Animals
{
	String animalname;
	String animaltype;
	Animals()
	{
		
		animalname="Cow";
		animaltype="Farm animal";
		System.out.println("animal name:"+animalname);
		System.out.println("Animal type:"+animaltype);
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		animalname="Tiger";
		animaltype="Wild animal";
		System.out.println("animal name:"+animalname);
		System.out.println("Animal type:"+animaltype);
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		animalname="Goat";
		animaltype="Farm animal";
		System.out.println("animal name:"+animalname);
		System.out.println("Animal type:"+animaltype);
		System.out.println("++++++++++++++++++++++++++++++");
	}
	
}
class Birds
{
	String birdname;
	String birdcolor;
	Birds()
	{
		
		birdname="Crowned Pigeon";
		birdcolor="blue";
		System.out.println("Bird name:"+birdname);
		System.out.println("Bird color:"+birdcolor);
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		birdname="Gallinule";
		birdcolor="Purple";
		System.out.println("Bird name:"+birdname);
		System.out.println("Bird color:"+birdcolor);
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		birdname="Love bird";
		birdcolor="Yellow";
		System.out.println("Bird name:"+birdname);
		System.out.println("Bird color:"+birdcolor);
		System.out.println("++++++++++++++++++++++++++++++");
		
	}
	
}
class Insects
{
	String insectsname;
	String insectswings;
	Insects()
	{
		
		insectsname="Dragons";
		insectswings="Membranous";
		System.out.println("Insects name:"+insectsname);
		System.out.println("Bird color:"+insectswings);
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		insectsname="Thrips";
		insectswings="Fringed";
		System.out.println("Insects name:"+insectsname);
		System.out.println("Bird color:"+insectswings);
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		insectsname="Cockroach";
		insectswings="Tegmina";
		System.out.println("Insects name:"+insectsname);
		System.out.println("Bird color:"+insectswings);
	}
	
}

public class InstanceDemo4 
{

	public static void main(String[] args) 
	{
		Animals obj1=new Animals();
		
		
		Animals obj2=new Animals();
		
		
		Animals obj3=new Animals();
		
		
		Birds var1=new Birds();
		
		
		Birds var2=new Birds();
		
		
		Birds var3=new Birds();
		
		
		Insects name1=new Insects();
		
		
		
		Insects name2=new Insects();
		
		
		Insects name3=new Insects();
		
		
		
		
		
				
		

	}

}
