package OOPSPrinciples.Inheritance.Hierachal;

public class Child2 extends Parent{
    void Bicycle(){
        System.out.println("Child Cycle!");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child2 child2 = new Child2();

        parent.House();
        parent.Car();
        parent.Bike();
        child2.Bicycle();
    }
}
