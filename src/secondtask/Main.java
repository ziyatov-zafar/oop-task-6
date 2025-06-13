package secondtask;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal duck = new Duck();
        Animal cat = new Cat();

        System.out.print(dog.getName() + " says: ");
        dog.sound();

        System.out.print(duck.getName() + " says: ");
        duck.sound();

        System.out.print(cat.getName() + " says: ");
        cat.sound();
    }
}
