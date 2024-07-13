package OOPSPrinciples.Inheritance.Single;

//Single Inheritance.
public class Child1 extends Parent {
    public static void main(String[] args) {

        System.out.println("Child Has: ");
        Parent parent = new Parent();
        parent.House();
        parent.Bike();
        parent.car();
    }
}
