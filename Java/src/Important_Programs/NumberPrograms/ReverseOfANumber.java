package Important_Programs.NumberPrograms;
import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int Num = sc.nextInt();
        int rem,rev=0;
        int ANum = Num;
        while (Num!=0){
            rem = Num%10;
            rev = rev*10+rem;
            Num = Num/10;
        }

        System.out.println("Reverse Of "+ANum+" Is: "+rev);

        if(ANum==rev){
            System.out.print(ANum+" Is A Palindrome!");
        }
        else{
            System.out.print(ANum+" Is Not A Palindrome!");
        }
    }
}
