package com.sgtesting.iopackagedemo;

import java.io.File;

public class Assignment2 
{

	public static void main(String[] args) 
	{
		NestedFolder();

	}
	private static void NestedFolder()
	{
		for(int i=0;i<=0;i++)
		{
			File fd=new File("D:\\Demo1\\saml");
			fd.mkdir();
			for(int j=0;j<=0;j++)
			{
				File fd1=new File("D:\\Demo1\\saml\\saml2");
				fd1.mkdir();
				for(int l=0;l<=0;l++)
				{
					File fd2=new File("D:\\Demo1\\saml\\saml2\\saml3");
					fd2.mkdir();
				}
				
			}
		}
		
		
	}

}
