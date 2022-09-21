package com.sgtesting.string;

public class Assignment7a {

	public static void main(String[] args)
	{
		deleteday();

	}
	private static void deleteday()
	{
		String aa="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
		System.out.println("replaced:"+aa.replace("DAY"," "));
	}

}
