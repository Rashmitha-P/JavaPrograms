package com.simeio.def;

public class User implements IMobile,ILaptop {

	@Override
	public void call() {
	System.out.println("call using number");
	System.out.println("call using whatsapp");	
	}

	@Override
	public void playgames() {
		System.out.println("games from playstore");
		
	}

	@Override
	public void messageUser() {
		// TODO Auto-generated method stub
		System.out.println("message");
	}

	

	


	

	

}
