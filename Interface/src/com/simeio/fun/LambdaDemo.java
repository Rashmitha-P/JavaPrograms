package com.simeio.fun;

public class LambdaDemo {
	public static void main(String[] args) {
		IGames games=()->{
			System.out.println("block Games");
		};
		games.createApps();

		//IGreater

		Greeter greet=(name)->{System.out.println("Welcome "+name);};
//1
		greet.greetmessage("sri");
//2
		greet=(name)->System.out.println("Great Day "+ name);
		greet.greetmessage("priya");
		
//3	
		Checker check=(msg)->{
			return msg;
		};
		System.out.println(check.checkMessage("No message"));
		
//4
		check =(msg)->"your msg : " +msg;
		System.out.println(check.checkMessage("weekend"));
}
	
	
}
