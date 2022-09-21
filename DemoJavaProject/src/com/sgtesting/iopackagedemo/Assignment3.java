package com.sgtesting.iopackagedemo;

import java.io.File;

public class Assignment3 
{

	public static void main(String[] args) 
	{
		DaysSubfolder();
	}
	private static void DaysSubfolder()
	{
	String []days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	for(int i=0;i<=days.length-1;i++)
	{
		File ds=new File("D:\\Days\\weekdays\\"+days[i]);
		ds.mkdir();
		
		
	}
	}

}
