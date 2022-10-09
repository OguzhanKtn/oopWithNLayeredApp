package oopWithNLayeredApp;


import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApp.business.CategoryManager;
import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.core.EmailLogger;
import oopWithNLayeredApp.core.FileLogger;
import oopWithNLayeredApp.core.Logger;
import oopWithNLayeredApp.dataAccess.HibernateCategoryDao;
import oopWithNLayeredApp.dataAccess.JdbcCourseDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Courses;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Courses course1 = new Courses();
		Courses course2 = new Courses();
		
		course1.setName("Java");
		course1.setCost(250);
		
		course2.setName("Python");
		course2.setCost(1);
		
	    Logger[] loggers = {new EmailLogger(),new FileLogger()};
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
		
		courseManager.add(course2);
		
		System.out.println("************************************************");
		
		Category category1 = new Category();
		Category category2 = new Category();
		
		category1.setName("Fitness");
		category2.setName("Developer");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		
		categoryManager.add(category2);

	}

}
