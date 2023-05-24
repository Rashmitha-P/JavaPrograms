package com.voterapp.service;

import java.util.Scanner;

import com.voterapp.exception.invalidVoterException;



public class VoterMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an age");
	int age=sc.nextInt();
	System.out.println("Enter your locality");
	String locality=sc.next();
	System.out.println("Enter your voterid");
	int voterid=sc.nextInt();
	try {
		ElectionBoot electionBoot=new ElectionBoothIMPL();
		boolean result=electionBoot.checkEligibility(age,locality,voterid);
		if(result)
		{
			System.out.println("successfully registered for voterid");
		}
	}
	catch(invalidVoterException e)
	{
		System.out.println(e.getMessage());
	}
}
}
