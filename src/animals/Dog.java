package animals;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Hauuu");
        sayHello();
        System.out.println("Number of legs is "+legs);
    }
}
