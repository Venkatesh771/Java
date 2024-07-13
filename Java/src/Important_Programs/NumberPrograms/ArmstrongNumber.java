package Important_Programs.NumberPrograms;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int Num = sc.nextInt();
        int rem,sum=0;
        int ANum=Num;

        while(Num!=0){
            rem=Num%10;
            sum=sum+(rem*rem*rem);
            Num=Num/10;
        }

        if(sum==ANum){
            System.out.print(ANum+" Is A ArmStrong Number!");
        }
        else{
            System.out.print(ANum+" Is Not A ArmStrong Number!");
        }
    }
}
