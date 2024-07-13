package Important_Programs.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int i,j,temp;
        System.out.println("Enter Array Elements: ");
        for(i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }

        //Array Reverse Method-1.
        System.out.print("Method-1: ");
        for (i=A.length-1;i>=0;i--){
            System.out.print(A[i]+" ");
        }
        System.out.println();

        //Array Reverse Method-2.
        for (i=0,j=A.length-1;i<A.length/2;i++,j--){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }

        System.out.print("Method-2: ");
        for (i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
