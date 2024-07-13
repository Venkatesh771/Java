package Important_Programs.NumberPrograms;
import java.util.Scanner;
public class PrimeNumbersRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Min:");
        int Min = sc.nextInt();

        System.out.print("Enter Max:");
        int Max = sc.nextInt();
        int i,j;

        for (i=Min;i<=Max;i++){
            int count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i+" ");
            }
        }
    }
}
