package com.tdd.kgh;

import java.util.*;

import com.tdd.kgh.modules.*;
import com.tdd.kgh.RoomsDB;

public class Rum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{

			Inventory c1 = new Inventory();
			Inventory c2 = new Inventory();
			 c1.setName("sd");
			 c2.setName("sd2");
			 
			 c1.setCp(10);
			 c2.setCp(50);
			 
			 c1.setQty(10);c2.setQty(9);
			 
			 c1.setSp(50);c2.setSp(100);
			 
			 c1.setAvailability(false);c2.setAvailability(false);
			 c1.setCId(1); c2.setCId(2);
			 
			 InventoryDB db = new InventoryDB();
			 db.addInventory(c1);
			 db.addInventory(c2);
			 
			 Iterator<Inventory> iterator = db.showInventoryList().iterator();
			 
			 // while loop
			 while (iterator.hasNext()) {
				 Inventory o = iterator.next();
				 System.out.println("value= " + o.getName() + " " + o.getId() + " "+ o.getCp() );
			 }
			 
			 c1.setName("dddd");
			 c1.setId(1);
			 db.updateInventory(c1);
			 
			 iterator = db.showInventoryList().iterator();
			 
			 while (iterator.hasNext()) {
				 Inventory o = iterator.next();
				 System.out.println("value= " + o.getName() + " " + o.getId() + " "+ o.getCp() );
			 }
			 
			 db.deleteInventory(c1);
			 iterator = db.showInventoryList().iterator();
			 
			 // while loop
			 while (iterator.hasNext()) {
				 Inventory o = iterator.next();
				 System.out.println("value= " + o.getName() + " " + o.getId() + " "+ o.getCp() );
			 }
			 
			 
			
		}
		catch(Exception e) {
			//System.out.print("eeeeeeeee");
			e.printStackTrace();
			
		}
		
	}

}


