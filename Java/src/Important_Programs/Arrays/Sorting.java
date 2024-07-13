package Important_Programs.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] A = new int[n];

        System.out.println("Enter Array Elements: ");
        int i,j,temp;
        for(i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }

        //Sorting.
        for(i=0;i< A.length;i++){
            for(j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for(i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }

    }
}
