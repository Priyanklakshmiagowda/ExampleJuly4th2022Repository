package com.sgtesting.constructor;
class Player
{
	Player(String playername,int jersyno)
	{
		System.out.println("Player name:"+playername);
		System.out.println("jersy number:"+jersyno);
		
	}
	Player(String gamename)
	{
		this("Deekshitha",04);
		System.out.println("Game name:"+gamename);
	}
}

public class ConstructorChainingplayaer 
{

	public static void main(String[] args) 
	{
		
		Player obj2=new Player("kabaddi");

	}

}
