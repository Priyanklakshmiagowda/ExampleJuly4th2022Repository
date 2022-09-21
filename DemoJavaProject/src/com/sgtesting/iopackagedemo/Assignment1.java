package com.sgtesting.iopackagedemo;

import java.io.File;

public class Assignment1 
{
	public static void main(String[] args) 
	{
		createfoldersam();
	}
	
	private static void createfoldersam()
	{
		try
		{	
			for(int i=0;i<=9;i++)
			{
				File fq=new File("D:\\sam\\sam1"+i);
				fq.mkdir();
			
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
