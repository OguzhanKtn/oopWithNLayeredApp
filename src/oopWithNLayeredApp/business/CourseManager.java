package oopWithNLayeredApp.business;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApp.core.Logger;
import oopWithNLayeredApp.dataAccess.CourseDao;
import oopWithNLayeredApp.entities.Courses;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Courses course) throws Exception {
		
		List<String> courses = new ArrayList<String>();
		
		courses.add("JavaScript");
		courses.add("C#");
		courses.add("PHP");
		
		if(course.getCost() < 0) {
			
			throw new Exception("Course's price cannot be less than 0");
		}
		
		for(int i = 0; i < courses.size(); i++) {
			
			if(courses.get(i) == course.getName()) {
				
				throw new Exception("This name is already exist");
			}
		}
		
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			
			logger.log(course.getName());
		
		}
		
		
	}
}
