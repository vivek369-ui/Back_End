package all_concept;

//polymorphism

class AnimalSounds {

	public void Sound() {

		System.out.println("The animals make different sounds when asked to speak. For example:");

	}

}

class Cow extends AnimalSounds {

	public void Sound() {

		System.out.println("The cow says: moh moh");

	}

}

class cat extends AnimalSounds {

	public void Sound() {

		System.out.println("The cat says: mew mew");

	}

}

class Dog extends AnimalSounds {

	public void Sound() {

		System.out.println("The dog says: bow wow");

	}

}

public class AnimalMain {

	public static void main(String[] args) {

		AnimalSounds Animal = new AnimalSounds();

		AnimalSounds cow = new Cow();

		AnimalSounds cat = new cat();

		AnimalSounds Dog = new Dog();

		Animal.Sound();

		cow.Sound();

		cow.Sound();

		Dog.Sound();

	}

}