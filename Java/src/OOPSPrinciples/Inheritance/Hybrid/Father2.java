package OOPSPrinciples.Inheritance.Hybrid;

public interface Father2 {
    default void Home2(){
        System.out.println("Father 2 House!");
    }
    default void Bike2(){
        System.out.println("Father 2 Bike!");
    }
    default void Car2(){
        System.out.println("Father 2 Car!");
    }
}
