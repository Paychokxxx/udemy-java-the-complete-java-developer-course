package section6.Inheritance081;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 1, 4, 1, 20, "long silky");
        dog.eat();
//        dog.walk();
        dog.run();
    }
}
