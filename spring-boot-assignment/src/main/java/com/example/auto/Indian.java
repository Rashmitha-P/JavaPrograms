package com.example.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Indian implements IFoodMenu {

	@Override
	public List<String> showitems() {
		
	List<String>list=Arrays.asList("idly","poori","dosa");
	System.out.println("items are:");
	return list;
	}

}
