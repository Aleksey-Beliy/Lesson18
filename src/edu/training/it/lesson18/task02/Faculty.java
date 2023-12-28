package edu.training.it.lesson18.task18;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends UnivercityMember implements Research {

	private String department;
	private List<String> courseTeaching;

	public Faculty(String name, int id, String email, String depertment) {
		super(name, id, email);
		this.department = department;
		this.courseTeaching = new ArrayList<>();
	}

	public void assignCourse(String courseName) {
		this.courseTeaching.add(courseName);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<String> getCourseTeaching() {
		return courseTeaching;
	}

	@Override
	public void displayMember() {
		System.out.println("Ф.И = " + getName() + "; id = " + getId() + "; email: " + getEmail() + getDepartment());

	}
	
	@Override
	public void conductResearch() {
		System.out.println("Conducting researcg.");
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseTeaching, department);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		return Objects.equals(courseTeaching, other.courseTeaching) && Objects.equals(department, other.department);
	}

	@Override
	public String toString() {
		return "Faculty [department=" + department + ", courseTeaching=" + courseTeaching + "]";
	}

}
