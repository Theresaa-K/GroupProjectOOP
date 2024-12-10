package ZooEcosystem;

public class Elephant extends Mammal{ public Elephant(String name, String animalType, int age) {
    super(name, animalType, age);
}

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Fun Fact: Elephants can communicate over long distances using infrasound, which are sounds that are below the range of human hearing.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " likes to eat peanuts.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a trumpet sound!");
    }
}
