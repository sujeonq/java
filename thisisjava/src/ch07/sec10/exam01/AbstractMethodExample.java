package ch07.sec10.exam01;

import ch07.sec10.exam02.Animal;
import ch07.sec10.exam02.Cat;
import ch07.sec10.exam02.Dog;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

		animalsound(new Dog());
		animalsound(new Cat());

	}

	public static void animalsound(Animal animal) {
		animal.sound();
	}

}
