package oopWithNLayeredApp.business;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApp.core.Logger;
import oopWithNLayeredApp.dataAccess.CategoryDao;
import oopWithNLayeredApp.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		
		List<String> categories = new ArrayList<String>();
		
		categories.add("Programming");
		categories.add("Fitness");
		
		for(int i = 0; i < categories.size(); i++) {
			
			if(category.getName() == categories.get(i)) {
				throw new Exception("This name is already exist");
			}
		}
		
		categoryDao.add(category);
		
		for(Logger logger : loggers) {
			
			logger.log(category.getName());
		}
	}
}
