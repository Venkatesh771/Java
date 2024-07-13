package Important_Programs.NumberPrograms;
import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num 1: ");
        int Num1 = sc.nextInt();

        System.out.print("Enter Num 2: ");
        int Num2 = sc.nextInt();

        int i, GCD=1;

        for(i=2;i<=Num1;i++){
            if(Num1%i==0 && Num2%i==0){
                GCD=i;
            }
        }
        System.out.println("Gcd Is: "+GCD);
    }
}
