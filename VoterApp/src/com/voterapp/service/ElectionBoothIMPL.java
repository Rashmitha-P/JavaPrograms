package com.voterapp.service;

import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.exception.invalidVoterException;

public class ElectionBoothIMPL implements ElectionBoot {
String [] localities= {"Bangalore","chennai", "Hyderabad"};
	@Override
	public boolean checkEligibility(int age, String locality, int voterid) throws invalidVoterException, UnderAgeException
	{
	boolean resultage=checkAge(age);
	if(resultage==true)
	{
		boolean resultlocality=checkLocality(locality);
		if(resultlocality==true)
			return true;
		else
			return false;
	}
	else
		return false;
	}
	

private boolean checkAge(int age) throws UnderAgeException
{
	if(age<18) throw new UnderAgeException("Your age should be above 18");
	else
		return true;
}
private boolean checkLocality (String locality)throws LocalityNotFoundException
{int count=0;
for(String locality1:localities)
{
	if(locality1.equals(locality1))
	{
		count++;
		break;
	}
}
if(count==0)
{
	throw new LocalityNotFoundException("locality doesnt found");
}
return true;
}
	private boolean checkVoterId(int voterid) throws NoVoterIdException
	{
		if(voterid>=1000 && voterid <= 9999)
		{
			System.out.println("in range");
		}
		else
		{
			throw new NoVoterIdException();
		}
		return true;
	}
}


	


