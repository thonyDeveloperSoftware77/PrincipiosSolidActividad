package lsp;

public class Dog extends Animal implements Walkable {

	public void walk() {
        System.out.println("Animal is walking.");
	}

	@Override
	public void makeSound() {
        System.out.println("Dog barks.");
	}
}