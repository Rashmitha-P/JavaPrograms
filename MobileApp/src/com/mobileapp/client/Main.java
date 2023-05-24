package com.mobileapp.client;

import java.util.Scanner;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobileService;
import com.mobileapp.service.MobileServiceIMPL;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		try {MobileService mobileservice = new MobileServiceIMPL();
			System.out.println("enter the mobile ID");
			int id = sc.nextInt();
			System.out.println(mobileservice.getById(id));

			System.out.println("--------------------");
			System.out.println("Details of all mobiles");
			Mobile[] mobiles = mobileservice.getAll();
			for (Mobile mobile : mobiles) {
				System.out.println(mobile);
			}

			System.out.println("---------------------");
			System.out.println("enter brand of the mobile");
			String brand = sc.next();
			Mobile[] mobilebrand = mobileservice.getByBrand(brand);
			for (Mobile mobilebybrand : mobilebrand) {
				System.out.println(mobilebybrand);
			}

		} catch (MobileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
