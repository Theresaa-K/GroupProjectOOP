package ZooEcosystem;

public class Bird extends Animal {
    public Bird(String name, String animalType, int age) {
        super(name, animalType, age);
    }

    @Override
    public void eat() {
        String birdFood1 = "worms";
        String birdFood2 = "seeds";
        System.out.println("Birds like to eat " + birdFood1 + " and " + birdFood2 + ".");
    }

    @Override
    public void makeSound() {
        String crow = "caw";
        String cardinal = "tweet";
        System.out.println("Birds " + crow + " and " + cardinal + ".");
    }

    @Override
    public void sleep() {
        System.out.println("A " + getAnimalType() + " will only sleep when it is dark.");
    }

    @Override
    public void displayInformation() {
        System.out.println("The " + getAnimalType() + " is amazing! The " + getAnimalType() + " is " + getAge() + " years old, and it's name is " + getName() + ". Many " + getAnimalType() + "'s live at the " + getHome() + ".");
        eat();
        sleep();
        makeSound();
    }
}
