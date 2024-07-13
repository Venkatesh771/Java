package OOPSPrinciples.Inheritance.MultilevelInheritance;

public class Child extends Parent2 {
    public static void main(String[] args) {
        Parent1 GrandParent = new Parent1();
        Parent2 Parent = new Parent2();

        GrandParent.House();
        GrandParent.car();
        GrandParent.Bike();

        Parent.Bike2();
        Parent.Car2();
    }
}
