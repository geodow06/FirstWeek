package app;

public abstract class Mammal extends Animal {

	@Override
	public void eat() {
		System.out.println("om nom");

	}

	@Override
	public void sleep() {
		System.out.println("zzz");

	}

	@Override
	public void reproduce() {
		System.out.println("bom chick-a");

	}

}
