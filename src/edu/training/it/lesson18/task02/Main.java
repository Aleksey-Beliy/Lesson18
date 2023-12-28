package edu.training.it.lesson18.task18;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Петров Петр", 1, "petrov.petr@task.com");
		Student student2 = new Student("Иванов Иван", 2, "ivanov.ivan@task.com");

		student1.displayMember();
		student2.displayMember();
		System.out.println();
		
		Faculty faculty1 = new Faculty("Петров Петр", 1, "petrov.petr@task.com", "Программное обеспечение");
		Faculty faculty2 = new Faculty("Иванов Иван", 2, "ivanov.ivan@task.com", "Информационных технологий");
	
		faculty1.displayMember();
		faculty2.displayMember();
		System.out.println();
		
		Staff staff = new Staff("Сидоров Артем", 3, "sidorov.artem@task.com", "Программирование", "Разработчик");
		staff.displayMember();
		System.out.println();
		
		
	}

}
