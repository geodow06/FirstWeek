package app;

public abstract class Reptile extends Animal {

	@Override
	public void eat() {
		System.out.println("rip");

	}

	@Override
	public void sleep() {
		System.out.println("Bask");

	}

	@Override
	public void reproduce() {
		System.out.println("Eggs");

	}

}
