package ZooEcosystem;

public class Eagle extends Bird{ public Eagle(String name, String animalType, int age) {
    super(name, animalType, age);
}

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Fun fact: The call that an eagle makes will depend on whether they are hunting, mating, or signaling danger.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " likes to eat fish.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a whistling sound!");
    }
}
