package edu.training.it.lesson18.task18;

import java.util.Objects;

public abstract class UnivercityMember {

	private String name;
	private int id;
	private String email;

	public UnivercityMember() {
	}

	public UnivercityMember(String name, int id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public void displayMember() {
		System.out.println("Name = " + name);
		System.out.println("id = " + id);
		System.out.println("email = " + email);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnivercityMember other = (UnivercityMember) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "UnivercityMember [name=" + name + ", id=" + id + ", email=" + email + "]";
	}

}
