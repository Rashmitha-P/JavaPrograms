package com.example.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Chinese implements IFoodMenu{

	@Override
	public List<String> showitems() {
		List<String> list=Arrays.asList("Fried rice","Panner rice","noodles");
		System.out.println("the chinese items are");
		return list;
	}

}
