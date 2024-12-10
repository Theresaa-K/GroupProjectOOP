package ZooEcosystem;

public class Mammal extends Animal{
    public Mammal(String name, String animalType, int age) {
        super(name, animalType, age);
    }

    @Override
    public void eat() {
        String mammalFood1 = "meat";
        String mammalFood2 = "vegetables";
        System.out.println("Mammals like to eat " + mammalFood1 + " and " + mammalFood2 + ".");
    }

    @Override
    public void makeSound() {
        String lion = "roar";
        String cat = "meow";
        String dog = "bark";
        System.out.println("Mammals " + lion + ", " + cat + ", " + dog + ".");
    }

    @Override
    public void sleep() {
        System.out.println("A mammal like a " + getAnimalType() + ", likes to sleep when they please.");
    }

    @Override
    public void displayInformation() {
        System.out.println("The " + getAnimalType() + " is " + getAge() + " years old, and it's name is " + getName() + ". " + getName() + " lives at " + getHome() + ".");
        eat();
        sleep();
        makeSound();
    }
}
