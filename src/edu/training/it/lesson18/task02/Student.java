package edu.training.it.lesson18.task18;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends UnivercityMember implements Research{

	private List<String> courseList;
	private double gpa;

	public Student(String name, int id, String email) {
		setName(name);
		setId(id);
		setEmail(email);
		this.courseList = new ArrayList<>();
	}

	public void addCourse(String newCourse) {
		this.courseList.add(newCourse);

	}

	public List<String> getCourseList() {
		return courseList;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public void displayMember() {
		System.out.println("Ф.И = " + getName() + "; id = " + getId() + "; email: " + getEmail());
	}
	
	@Override
	public void conductResearch() {
		System.out.println("Conducting researcg.");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(courseList, gpa);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(courseList, other.courseList)
				&& Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa);
	}

	@Override
	public String toString() {
		return "Student [courseList=" + courseList + ", gpa=" + gpa + "]";
	}

	

}
