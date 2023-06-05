package com.example.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Continental implements IFoodMenu{

	@Override
	public List<String> showitems() {
		List<String> list=Arrays.asList("Bread sandwich","pancakes","french toast");
		System.out.println("the  food items are:");
		return list;
	}

}
