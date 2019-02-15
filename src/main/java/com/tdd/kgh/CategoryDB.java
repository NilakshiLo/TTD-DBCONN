package com.tdd.kgh;

import java.io.*;
import java.sql.*;
import com.tdd.kgh.modules.*;
import java.util.*;

public class CategoryDB {
	
	/*
	 * add category
	 * update category
	 * delete category
	 * show count
	 * show category list
	 * import category file
	 * */
	
	/*ArrayList<Category> showCategoryList(){
		
		try{
			String resourceName = "db.properties"; // could also be a constant
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			Properties props = new Properties();
			InputStream resourceStream = loader.getResourceAsStream(resourceName);
			props.load(resourceStream);
			String qry = props.getProperty("showCategoryList");
			Connection con = DBConnection.con;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
		
			ArrayList<Category> categoryList = new ArrayList<Category>(10);
			while(rs.next()){
				
			}
			
			return categoryList;
		}
		catch(Exception e) {
			
		}
		
	}
	
	*/
	
	
}
