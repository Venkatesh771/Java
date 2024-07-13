package Important_Programs.NumberPrograms;

public class SwappingOfTwoNumbers {
    public static void main(String[] args) {
        int A=10;
        int B=20;

        A=A+B;
        B=A-B;
        A=A-B;

        System.out.println("After Swapping A="+A);
        System.out.println("After Swapping B="+B);
    }
}
