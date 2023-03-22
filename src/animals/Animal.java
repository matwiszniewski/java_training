package animals;

public abstract class Animal {

    public abstract void sound();

    public void sayHello() {
        System.out.println("Hello, I am an animal");
    }

    public final static int legs = 4;

}
