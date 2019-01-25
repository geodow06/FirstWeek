package app;

public abstract class Insect extends Animal {

	@Override
	public void eat() {
		System.out.println("suck");

	}

	@Override
	public void sleep() {
		System.out.println("do we even sleep");

	}

	@Override
	public void reproduce() {
		System.out.println("nasty");

	}

}
