package Important_Programs.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class RemovingDuplicates {
    //Duplicates Function
    public static int RemoveDuplicates(int[] A, int n){
        if(n==0 | n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0,i;
        for(i=0;i<n-1;i++){
            if(A[i]!=A[i+1]){
                temp[j++] = A[i];
            }
        }
        temp[j++] = A[n-1];

        for (i=0;i<n-1;i++){
            A[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int i;

        System.out.println("Enter Array Elements: ");
        for(i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int Length = A.length;
        int res = RemoveDuplicates(A,Length);

        System.out.println("After Removing Duplicates: ");
        for(i=0;i<res;i++){
            System.out.print(A[i]+" ");
        }
    }
}
