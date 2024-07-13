package Important_Programs.Arrays;
import java.util.Scanner;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[6];
        int i,j;
        System.out.println("Enter Array Elements: ");
        for(i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Duplicate Elements Are: ");
        for(i=0;i<A.length;i++){
            for(j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    System.out.print(A[j]+" ");
                }
            }
        }
    }
}
