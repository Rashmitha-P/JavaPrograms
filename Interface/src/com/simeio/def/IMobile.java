package com.simeio.def;

public interface IMobile {
void call();
void playgames();
default void messageUser ()
{
	System.out.println("Message via whatsapp , sms");
}
}
