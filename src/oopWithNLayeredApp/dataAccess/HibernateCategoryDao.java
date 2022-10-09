package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Added to db by Jdbc");
		
	}

}
