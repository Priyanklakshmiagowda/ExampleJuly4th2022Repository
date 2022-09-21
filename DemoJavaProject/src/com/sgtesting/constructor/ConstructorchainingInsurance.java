package com.sgtesting.constructor;
class Insurance
{
	Insurance(String policyholder,String policytype)
	{
		System.out.println("Policy holder name:"+policyholder);
		System.out.println("Ploicy type:"+policytype);
	}
	Insurance(int termplan)
	{
		this("priyanka","LIC");
		System.out.println("Term plan:"+termplan);
	}
}

public class ConstructorchainingInsurance 
{

	public static void main(String[] args)
	{
		Insurance ins=new Insurance(23);

	}

}
