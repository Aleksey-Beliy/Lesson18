package edu.training.it.lesson18.task18;

import java.util.Objects;

public class Staff extends UnivercityMember {

	private String department;
	private String jobTitle;

	public Staff(String name, int id, String email, String department, String jobTitle) {
		super(name, id, email);
		this.department = department;
		this.jobTitle = jobTitle;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void displayMember() {
		System.out.println("Ф.И = " + getName() + "; id = " + getId() + "; email: " + getEmail() + ";  Отделение: " + getDepartment() + ";  Должность: " + getJobTitle());
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(department, jobTitle);
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
		Staff other = (Staff) obj;
		return Objects.equals(department, other.department) && Objects.equals(jobTitle, other.jobTitle);
	}

	@Override
	public String toString() {
		return "Staff [department=" + department + ", jobTitle=" + jobTitle + "]";
	}

}
