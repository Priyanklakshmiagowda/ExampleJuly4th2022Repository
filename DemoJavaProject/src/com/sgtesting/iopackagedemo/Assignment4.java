package com.sgtesting.iopackagedemo;

import java.io.File;

public class Assignment4 {

	public static void main(String[] args) 
	{
		//displayexcelename();
		//displayFoldername();
		//displayimagename();
		//displayjavafile();
		//displaypptname();
		displayAll();

	}
	private static void displayexcelename()
	{

		File fa=new File("D:\\priyanka");
		File f[]=fa.listFiles();
		for(int i=0;i<f.length;i++)
		{
			String path=f[i].getPath();
			if(path.contains("xlsx"))
			{
				System.out.println(path);

			}

		}
	}
	private static void displayFoldername()
	{
		File fa=new File("D:\\priyanka");
		File f[]=fa.listFiles();
		for(int i=0;i<=f.length-1;i++)
		{
			String path=f[i].getPath();
			if(path.contains("folder"))
			{
				System.out.println(path);
			}
		}
	}
	private static void displayimagename()
	{
		File fa=new File("D:\\priyanka");
		File f[]=fa.listFiles();
		for(int i=0;i<=f.length-1;i++)
		{
			String path=f[i].getPath();
			if(path.contains("bmp"))
			{
				System.out.println(path);
			}
		}
	}
	private static void displayjavafile()
	{
		File fa=new File("D:\\priyanka");
		File f[]=fa.listFiles();
		for(int i=0;i<=f.length-1;i++)
		{
			String path=f[i].getPath();
			if(path.contains("java"))
			{
				System.out.println(path);
			}
			
		}
	}
	private static void displaypptname()
	{
		File fa=new File("D:\\priyanka");
		File f[]=fa.listFiles();
		for(int i=0;i<=f.length-1;i++)
		{
			String path=f[i].getPath();
			if(path.contains("pptx"))
			{
				System.out.println(path);
			}
		}
	}
	
	private static void displayAll()
	{
		File fa=new File("D:\\priyanka");
		File f1[]=fa.listFiles();
		for(File kk: f1)
		{
			System.out.println(kk);
		}

	}

}
