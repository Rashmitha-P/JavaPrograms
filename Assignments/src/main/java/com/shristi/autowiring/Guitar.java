package com.shristi.autowiring;

import org.springframework.stereotype.Component;

@Component("instrument")
public class Guitar implements Instrument{

	@Override
	public void play(String song) {
		System.out.println("Song played  by guitar" +song);
		
	}

}
