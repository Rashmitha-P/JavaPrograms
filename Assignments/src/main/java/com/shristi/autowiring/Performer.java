package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	@Autowired
	Instrument instrument;

	@Autowired
	Instrument keyboard;

	@Autowired
	Instrument violin;

	void playSong(String type, String song) {
		if (type.equals("Violin")) {
			instrument = new Violin();
			violin.play(song);
		}

		if (type.equals("Keyboard")) {
			instrument = new Keyboard();
			keyboard.play(song);
		}

		if (type.equals("Guitar")) {
			instrument = new Guitar();
			instrument.play(song);
		}

	}
}
