package ZooEcosystem;

public class Parrot extends Bird{public Parrot(String name, String animalType, int age) {
    super(name, animalType, age);
}

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Fun Fact: A parrot can mimic human speech and they are highly intelligent.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " likes to eat seeds.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a squawking sound!");
    }
}
