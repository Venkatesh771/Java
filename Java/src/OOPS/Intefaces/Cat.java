package OOPS.Intefaces;
public class Cat implements Animal{

    @Override
    public void MakeSound() {
        System.out.println("Cat Sounds!");
    }

    @Override
    public void Move() {
        System.out.println("Cat Running!");
    }
}
