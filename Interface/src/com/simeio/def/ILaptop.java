package com.simeio.def;

public interface ILaptop {
void call();
default void messageUser ()
{
	System.out.println("Message via teams,gmail");
}
}
