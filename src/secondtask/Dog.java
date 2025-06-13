package secondtask;

public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void sound() {
        System.out.println("bow bow");
    }
}
