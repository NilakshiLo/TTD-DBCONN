package com.tdd.kgh;

import java.util.*;

import com.tdd.kgh.modules.*;
import com.tdd.kgh.RoomsDB;

public class Rum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			RoomsDB rdb = new RoomsDB();
			Room r = new Room();
			r.setName("S");
			r.setPrice(12);
			r.setSize(3);
			Room r1 = new Room();
			r1.setName("P");
			r1.setPrice(13);
			r1.setSize(4);
			if(rdb.addRoom(r1)) System.out.println("cffff");
		    else System.out.println("dsdwefwef");
			
			Iterator<Room> iterator = rdb.showCategoryList().iterator();
			 
	        // while loop
	        while (iterator.hasNext()) {
	        System.out.println("value= " + iterator.next());
	        }
	        r.setId(4);
	        r.setName("Nilakshi");
	        rdb.updateRoom(r);
		
	        iterator = rdb.showCategoryList().iterator();
			 
	        // while loop
	        while (iterator.hasNext()) {
	        System.out.println("value= " + iterator.next());
	        }
	        
	        rdb.deleteRoom(r);
	        iterator = rdb.showCategoryList().iterator();
			 
	        // while loop
	        while (iterator.hasNext()) {
	        System.out.println("value= " + iterator.next());
	        }
	        
	        
		}
		catch(Exception e) {
			//System.out.print("eeeeeeeee");
			e.printStackTrace();
			
		}
		
	}

}
