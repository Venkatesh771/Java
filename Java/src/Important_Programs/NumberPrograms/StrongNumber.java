package Important_Programs.NumberPrograms;
import java.util.Scanner;
//Strong Number = Sum of Factorials.
public class StrongNumber {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int n = sc.nextInt();
        int An = n;
        int rem,sum=0;

        while(n!=0){
            rem = n%10;
            sum = sum+factorial(rem);
            n=n/10;
        }

        if(An==sum){
            System.out.println(sum+" Is A Strong Number:");
        }
        else{
            System.out.println(sum+" Is Not A Strong Number:");
        }
    }
}
