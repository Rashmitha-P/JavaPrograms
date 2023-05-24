package com.simeio.fun;

public class AnonyClass {
public static void main(String[] args) {
	IGames g=new BlockGames();
	g.createApps();
	
	
	
	IGames games=new IGames()
			{

				@Override
				public void createApps() {
					System.out.println("Block Games");
					
				}
		
			};
			//call the method
			games.createApps();
}
}
