package ZooEcosystem;

public class Lion extends Mammal{  public Lion(String name, String animalType, int age) {
    super(name, animalType, age);
}

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Fun Fact: A lion's roar can be heard up to eight kilometers away!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " likes to eat meat.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a roar sound!");
    }
}
