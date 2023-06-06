package com.shristi.autowiring;

import org.springframework.stereotype.Component;
@Component
public class Keyboard implements Instrument {

	@Override
	public void play(String song) {
		{
			System.out.println("Song played  by keyboard" +song);
			
		}
		
	}

}
