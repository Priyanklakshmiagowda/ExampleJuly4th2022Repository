package com.sgtesting.javatest;
class OvelOrNot
{
	char k()
	{
		char ch='b';
		switch(ch)
		{
		case'a': case'e':case'i':case'o':case'u':
		break;
		
		}
		return ch;
		
		
		
		
	}
}
public class OvelNot
{

	public static void main(String[] args) 
	{
		OvelOrNot obi=new OvelOrNot();
		char p=obi.k();
		if(p=='b')
		{
			System.out.println("is a vowel:"+p);
		}
		else
		{
			System.out.println("is not a vowel");
		}
		

	}

}
