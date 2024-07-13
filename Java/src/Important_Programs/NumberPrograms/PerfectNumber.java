package Important_Programs.NumberPrograms;
import java.util.Scanner;
//Perfect Number = Sum Of Factors.
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number: ");
        int Num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=Num/2;i++){
            if(Num%i==0){
                sum = sum+i;
            }
        }
        System.out.println("Sum Is: "+sum);
        if(sum==Num){
            System.out.println(Num+" Is A Perfect Number:");
        }
        else{
            System.out.println(Num+" Is Not A Perfect Number:");
        }
    }
}
