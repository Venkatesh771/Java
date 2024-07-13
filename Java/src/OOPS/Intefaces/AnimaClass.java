package OOPS.Intefaces;

public class AnimaClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.MakeSound();
        dog.Move();

        Cat cat = new Cat();
        cat.MakeSound();
        cat.Move();
    }
}
