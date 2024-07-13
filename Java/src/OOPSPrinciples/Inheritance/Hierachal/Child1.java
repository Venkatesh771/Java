package OOPSPrinciples.Inheritance.Hierachal;

public class Child1 extends Parent{

    void Bicycle(){
        System.out.println("Child Cycle!");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 child1 = new Child1();

        parent.House();
        parent.Bike();
        parent.Car();
        child1.Bicycle();
    }
}
