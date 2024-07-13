package Important_Programs.NumberPrograms;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Range: ");
        int N = sc.nextInt();
        int i=1,sum=0;
        while (i<=N){
            sum=sum+i;
            i++;
        }
        System.out.print("Sum Of "+N+" Numbers Is: "+sum);
    }
}
