package Important_Programs.Strings;
import java.util.Scanner;

public class StringDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String st = sc.next();

        char[] CA = st.toCharArray();
        int i,j;
        for(i=0;i<CA.length;i++){
            for(j=i+1;j<CA.length;j++){
                if(CA[i] == CA[j]){
                    System.out.println(CA[j]+" ");
                }
            }
        }
    }
}
