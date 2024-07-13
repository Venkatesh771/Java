package OOPSPrinciples.Inheritance.Hybrid;

public class Child implements Father1,Father2 {

    @Override
    public void Home() {
        Father1.super.Home();
    }

    @Override
    public void Bike() {
        Father1.super.Bike();
    }

    @Override
    public void Car() {
        Father1.super.Car();
    }

    @Override
    public void Home2() {
        Father2.super.Home2();
    }

    @Override
    public void Bike2() {
        Father2.super.Bike2();
    }

    @Override
    public void Car2() {
        Father2.super.Car2();
    }

    public void Cycle(){
        System.out.println("Child Cycle!");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.Home();
        child.Home2();

    }
}
