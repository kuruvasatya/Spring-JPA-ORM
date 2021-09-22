package com.test;

import com.entity.Alien;
import com.service.AlienService;

public class Test {
	public static void main(String args[]) {
		
		AlienService service = new AlienService();
//		Alien  alien = new Alien("satya","Morgan",700000);
//		service.insert(alien);
		System.out.println(service.get(4));
		
	}
}
