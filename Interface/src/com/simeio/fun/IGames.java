package com.simeio.fun;

//Anonymous functions
public interface IGames {
	// BlockGames, BoardGames , Arcade, Card
	void createApps();
}

class BlockGames implements IGames {

	@Override
	public void createApps() {
		System.out.println("block ");

	}
	
	

}
