package Important_Programs.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int i,SecondLargestNumber;
        System.out.println("Enter Array Elements: ");
        for(i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int N = A.length;
        SecondLargestNumber = A[N-2];
        System.out.print("Array Elements Are: ");
        for(i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("The Second Largest Element Is: "+SecondLargestNumber);
    }
}
