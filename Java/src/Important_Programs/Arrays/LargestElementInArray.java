package Important_Programs.Arrays;
import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int i,LargestNumber;
        System.out.println("Enter Array Elements: ");
        for(i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }

        LargestNumber = A[0];
        for(i=0;i<A.length;i++){
            if(A[i]>LargestNumber)
                LargestNumber = A[i];
        }

        System.out.println("Array Elements Are: ");
        for(i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("The Largest Element Is: "+LargestNumber);
    }
}
