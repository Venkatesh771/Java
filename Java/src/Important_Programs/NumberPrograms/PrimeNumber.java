package Important_Programs.NumberPrograms;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number:");
        int Number = sc.nextInt();
        int i,count=0;

        for(i=1;i<=Number;i++){
            if (Number%i==0){
                count++;
                System.out.println("Factors Are: "+i);
            }
        }

        if (count==2){
            System.out.println("It Is A Prime Number:");
        }
        else{
            System.out.println("It Is Not A Prime Number:");
        }
    }
}
