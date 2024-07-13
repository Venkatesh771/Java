package Important_Programs.Arrays;
import java.util.Scanner;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        int[] A = new int[10];
        int i,j;
        for(i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }

        int[] vis_array = new int[A.length];

        for(i=0;i<A.length;i++){
            int count = 1;
            for(j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    count++;
                    vis_array[j] = -1;
                }
            }
            if(vis_array[i]!=-1){
                vis_array[i] = count;
            }
        }

        for(i=0;i<vis_array.length;i++){
            if(vis_array[i]!=-1){
                System.out.println("Frequency Of "+A[i]+" Is: "+vis_array[i]);
            }
        }
    }
}
