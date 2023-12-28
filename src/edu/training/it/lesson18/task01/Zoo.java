package edu.training.it.lesson18.task01;

import java.util.ArrayList;

public class Zoo {

	private ArrayList<Object> animals = new ArrayList<>();

	public void addAnimal(Object animal) {
		animals.add(animal);
	}

	public void simulateDayLion() {
		for (Object animal : animals) {

			if (animal instanceof Lion) {
				((Lion) animal).makeSound();
			}
			if (animal instanceof Lion) {
				((Lion) animal).eat(5);
			}
			if (animal instanceof Lion) {
				((Lion) animal).makeSound();

			}
		}
	}

	public void simulateDayElephant() {
		for (Object animal : animals) {
			if (animal instanceof Elephant) {
				((Elephant) animal).eat(40);
			}
			if (animal instanceof Elephant) {
				((Elephant) animal).makeSound();
			}
			if (animal instanceof Elephant) {
				((Elephant) animal).makeSound();
			}
			if (animal instanceof Elephant) {
				((Elephant) animal).makeSound();
			}
		}
	}

	public void simulateDayMonkey() {
		for (Object animal : animals) {

			if (animal instanceof Monkey) {
				((Monkey) animal).makeSound();
			}
			if (animal instanceof Monkey) {
				((Monkey) animal).eat(15);
			}
			if (animal instanceof Monkey) {
				((Monkey) animal).makeSound();

			}
		}
	}

}