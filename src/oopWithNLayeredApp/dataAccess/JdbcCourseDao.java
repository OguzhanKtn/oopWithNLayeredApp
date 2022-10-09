package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Courses;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Courses courses) {
		System.out.println("Added to db by Jdbc");
		
	}

}
