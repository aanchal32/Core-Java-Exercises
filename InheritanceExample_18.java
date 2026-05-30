// Q18: Inheritance Example
public class InheritanceExample {

    static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound.");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Bark!");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.print("Animal: ");
        animal.makeSound();

        System.out.print("Dog:    ");
        dog.makeSound();

        // Polymorphism
        Animal polyDog = new Dog();
        System.out.print("Animal ref -> Dog obj: ");
        polyDog.makeSound();
    }
}
