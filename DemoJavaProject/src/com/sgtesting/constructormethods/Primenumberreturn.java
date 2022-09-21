package com.sgtesting.constructormethods;
class PrimeDemo
{
	boolean prime(int num)
	{
		boolean c=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				c=false;
				break;
			}
		}
		return c;
		
	}
}
public class Primenumberreturn {

	public static void main(String[] args) 
	{
		PrimeDemo o9=new PrimeDemo();
		boolean k= o9.prime(12);
		System.out.println(k);

	}

}
