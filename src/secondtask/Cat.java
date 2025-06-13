package secondtask;
public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public void sound() {
        System.out.println("meow meow");
    }
}

