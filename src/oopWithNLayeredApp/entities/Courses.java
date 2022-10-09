package oopWithNLayeredApp.entities;

import java.util.ArrayList;
import java.util.List;

public class Courses {

	private	int id;
	private	String name;
	private	String instructor;
	private double cost;
	private	List<String> program = new ArrayList<String>();
	
	public Courses() {
		super();
	}

	public Courses(int id, String name, String instructor, double cost,List<String> program) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.cost = cost;
		this.program = program;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public List<String> getProgram() {
		return program;
	}

	public void setProgram(List<String> program) {
		this.program = program;
	}
	
	
	
}
