package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Courses;

public class HibernateCourseDao implements CourseDao{

	public void add(Courses courses) {
		
		System.out.println("Added to db by Hibernate");
		
	}

	
}
