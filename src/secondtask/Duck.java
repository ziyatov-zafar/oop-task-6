package secondtask;
public class Duck extends Animal {
    public Duck() {
        super("Duck");
    }

    @Override
    public void sound() {
        System.out.println("quack quack");
    }
}
