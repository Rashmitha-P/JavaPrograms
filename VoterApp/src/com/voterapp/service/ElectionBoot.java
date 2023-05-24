package com.voterapp.service;

import com.voterapp.exception.invalidVoterException;

public interface ElectionBoot {
boolean checkEligibility(int age,String locality,int voterid) throws invalidVoterException;
}