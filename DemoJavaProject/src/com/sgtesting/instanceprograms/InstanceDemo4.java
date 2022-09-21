
package com.sgtesting.instanceprograms;
class Animals
{
	String animalname;
	String animaltype;
	
}
class Birds
{
	String birdname;
	String birdcolor;
	
}
class Insects
{
	String insectsname;
	String insectswings;
	
}

public class InstanceDemo4 
{

	public static void main(String[] args) 
	{
		Animals obj1=new Animals();
		obj1.animalname="Cow";
		obj1.animaltype="Farm animal";
		System.out.println("animal name:"+obj1.animalname);
		System.out.println("Animal type:"+obj1.animaltype);
		System.out.println("++++++++++++++++++++++++++++++");
		
		Animals obj2=new Animals();
		obj2.animalname="Tiger";
		obj2.animaltype="Wild animal";
		System.out.println("animal name:"+obj2.animalname);
		System.out.println("Animal type:"+obj2.animaltype);
		System.out.println("++++++++++++++++++++++++++++++");
		
		Animals obj3=new Animals();
		obj3.animalname="Goat";
		obj3.animaltype="Farm animal";
		System.out.println("animal name:"+obj3.animalname);
		System.out.println("Animal type:"+obj3.animaltype);
		System.out.println("++++++++++++++++++++++++++++++");
		
		Birds var1=new Birds();
		var1.birdname="Crowned Pigeon";
		var1.birdcolor="blue";
		System.out.println("Bird name:"+var1.birdname);
		System.out.println("Bird color:"+var1.birdcolor);
		System.out.println("++++++++++++++++++++++++++++++");
		
		Birds var2=new Birds();
		var2.birdname="Gallinule";
		var2.birdcolor="Purple";
		System.out.println("Bird name:"+var2.birdname);
		System.out.println("Bird color:"+var2.birdcolor);
		System.out.println("++++++++++++++++++++++++++++++");
		
		Birds var3=new Birds();
		var3.birdname="Love bird";
		var3.birdcolor="Yellow";
		System.out.println("Bird name:"+var3.birdname);
		System.out.println("Bird color:"+var3.birdcolor);
		System.out.println("++++++++++++++++++++++++++++++");
		
		Insects name1=new Insects();
		name1.insectsname="Dragons";
		name1.insectswings="Membranous";
		System.out.println("Insects name:"+name1.insectsname);
		System.out.println("Bird color:"+name1.insectswings);
		System.out.println("++++++++++++++++++++++++++++++");
		
		Insects name2=new Insects();
		name2.insectsname="Thrips";
		name2.insectswings="Fringed";
		System.out.println("Insects name:"+name2.insectsname);
		System.out.println("Bird color:"+name2.insectswings);
		System.out.println("++++++++++++++++++++++++++++++");
		
		Insects name3=new Insects();
		name3.insectsname="Cockroach";
		name3.insectswings="Tegmina";
		System.out.println("Insects name:"+name3.insectsname);
		System.out.println("Bird color:"+name3.insectswings);
		
		
		
		
				
		

	}

}
