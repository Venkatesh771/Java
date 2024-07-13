package OOPSPrinciples.Inheritance.Hybrid;

public interface Father1 {
    default void Home(){
        System.out.println("Father 1 House!");
    }
    default void Bike(){
        System.out.println("Father 1 Bike!");
    }
    default void Car(){
        System.out.println("Father 1 Car!");
    }
}
