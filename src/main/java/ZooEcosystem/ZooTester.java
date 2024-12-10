package ZooEcosystem;

public class ZooTester {
    public static void main(String[] args) {

        Lion lion = new Lion("Mufasa", "lion", 10);
        lion.displayInformation();
        System.out.println();

        Elephant elephant = new Elephant("Tipsy", "elephant", 42);
        elephant.displayInformation();
        System.out.println();

        Parrot parrot = new Parrot("Polly", "parrot", 15);
        parrot.displayInformation();
        System.out.println();

        Eagle eagle = new Eagle("Sir", "eagle", 7);
        eagle.displayInformation();
    }
}
