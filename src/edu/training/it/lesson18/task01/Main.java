package edu.training.it.lesson18.task01;

public class Main {

	public static void main(String[] args) {

		Zoo zoo = new Zoo();

		Lion lion = new Lion("Leo", 5);
		Elephant elephant = new Elephant("Elly", 10);
		Monkey monkey = new Monkey("Borya", 7);

		zoo.addAnimal(lion);
		zoo.addAnimal(elephant);
		zoo.addAnimal(monkey);

		zoo.simulateDayLion();
		zoo.simulateDayElephant();

		System.out.println(lion.toString());
		System.out.println(elephant.toString());
		System.out.println(monkey.toString());

	}

}
