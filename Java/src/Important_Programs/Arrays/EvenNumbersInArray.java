package Important_Programs.Arrays;
import java.util.Scanner;

public class EvenNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        System.out.println("Enter Array Elements: ");
        int i;
        for(i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("The Even Numbers In Array Are: ");
        for(i=0;i<A.length;i++){
            if(A[i]%2==0){
                System.out.print(A[i]+" ");
            }
        }
    }
}
