package com.example.auto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Restaurant {
	@Autowired
IFoodMenu indian;
	@Autowired
IFoodMenu chinese;
	@Autowired
IFoodMenu continental;
	public List<String> displayMenu(String choice)
	{
		List<String>list=new ArrayList<>();
		if(choice.equals("indian"))
			list=indian.showitems();
		if(choice.equals("chinese"))
			list=chinese.showitems();
		if(choice.equals("continental"))
			list=continental.showitems();
		return list;
	}
}
