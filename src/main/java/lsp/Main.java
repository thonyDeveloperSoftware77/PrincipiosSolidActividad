package lsp;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        if (dog instanceof Walkable) {
            ((Walkable) dog).walk();
        }

        fish.makeSound();
        if (fish instanceof Walkable) {
            ((Walkable) fish).walk(); 
        } else {
            System.out.println("This animal doesn't walk.");
        }
    }
}
