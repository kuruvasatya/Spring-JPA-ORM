package com.Test;

import com.dao.HumanDAOImp;
import com.entity.FourWheeler;
import com.entity.Human;
import com.entity.TwoWheeler;
import com.entity.Vehicle;

public class Test {
	public static void main(String args[]) {
		
		Human human1 = new Human("satya");
		Human human2 = new Human("Ganesh");
		
		Vehicle tw1 = new TwoWheeler(1, "Unicorn", 5, human1);
		Vehicle tw2 = new TwoWheeler(2, "Splender", 4, human2);
		Vehicle tw3 = new TwoWheeler(3, "TVS Xl", 0, null);
		
		Vehicle fw1 = new FourWheeler(4, "Verna", 5, human2);
		Vehicle fw2 = new FourWheeler(5, "ferari", 2, human1);
		Vehicle fw3 = new FourWheeler(6, "Innova", 10, null);
		
		
		
		HumanDAOImp service = new HumanDAOImp();
		service.insert(human1);
		service.insert(human2);
		
		service.insert(tw1);
		service.insert(tw2);
		service.insert(tw3);
		
		service.insert(fw1);
		service.insert(fw2);
		service.insert(fw3);
		
		for(Object data[]: service.getData())
		{
			for(Object row: data)
			{
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}
}
