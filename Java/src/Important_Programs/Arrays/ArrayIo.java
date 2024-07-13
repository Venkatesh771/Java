package Important_Programs.Arrays;
import java.util.Scanner;

public class ArrayIo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int i,count=0,Avg,Sum=0;
        System.out.println("Enter Array Elements: ");
        for(i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }

        System.out.print("Array Elements Are: ");
        for(i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
            count++;
            Sum=Sum+A[i];
        }

        System.out.println();
        System.out.println("Array Has "+count+" Elements!");
        System.out.println("Average is: "+Sum/count);
    }
}
