package com.mobileapp.service;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;

public class MobileServiceIMPL implements MobileService{

	@Override
	public Mobile getById(int id) throws MobileNotFoundException {
		Mobile[] mobiles=allMobiles();
		int count=0;
			for(Mobile mobile:mobiles)
			{
				if(mobile.getMobileId()==id)
				{
					count++;
					return mobile;
				}
			}
				if(count==0)
					throw new MobileNotFoundException("Mobile is not found");
		
		
		return null;
	}

	@Override
	public Mobile[] getAll() {
Mobile[] mobiles=allMobiles();

		return mobiles ;
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFoundException {
Mobile[] mobiles=allMobiles();
int count=0;
for(Mobile mobile:mobiles)
{ if(mobile.getBrand().equals(brand))
count++;}
Mobile[] getbybrand=new Mobile[count];
if(count>0)
{ int j=0;
for(int i=0;i<mobiles.length;i++)
{
	if(mobiles[i].getBrand().equals(brand))
	{
		getbybrand[j]=mobiles[i];
		j++;
	}
}
	
}
else
	throw new  MobileNotFoundException("brand not found");
		
return getbybrand;
	}
		
	private Mobile[] allMobiles()
	{
		Mobile[] mobiles=new Mobile[7];
		mobiles[0]=new Mobile("A1",89078,"Lenovo",1);
		mobiles[1]=new Mobile("A2",89078,"Samsung",2);
		mobiles[2]=new Mobile("A3",89078,"Lenovo",3);
		mobiles[3]=new Mobile("A4",89078,"Vivo",4);
		mobiles[4]=new Mobile("A5",89078,"Vivo",5);
		mobiles[5]=new Mobile("A6",89078,"Apple",6);
		mobiles[6]=new Mobile("A7",89078,"oppo",7);
		return mobiles;
}
	}
