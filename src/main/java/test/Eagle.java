package test;

public class Eagle extends Bird implements Flyable {
    public Eagle (String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("кричит");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " летит");
    }
}
