package ZooEcosystem;

public abstract class Animal implements AnimalBehavior {
    private String name;
    private String animalType;
    private int age;
    static String home = "Syntax Animal Zoo";

    public Animal (String name, String animalType, int age){
        this.name = name;
        this.animalType = animalType;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAnimalType(){
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getHome() {
        return home;
    }

    public static void setHome(String home) {
        Animal.home = home;
    }

    public void sleep() {
        System.out.println("Animal sleeps often");
    }
    public abstract void displayInformation();

}
