package com.sgtesting.practiceprograms;

public class WhileLong 
{

	public static void main(String[] args)
	{
         long l[][]= {{11111,11112,11113},{11114,11115,11116}};
         int i=0;
         while(i<=l.length-1)
         {
        	 int j=0;
        	 while(j<=l[i].length-1)
        	 {
        		 System.out.print(l[i][j]+" ");
        		 j++;
        	 }
        	 System.out.println();
        	 i++;
         }

	}

}
