package OOPS.Intefaces;
public class Dog implements Animal {

    @Override
    public void MakeSound() {
        System.out.println("Dog Barking!");
    }

    @Override
    public void Move() {
        System.out.println("Dog Running!");
    }
}
