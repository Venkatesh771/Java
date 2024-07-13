package Important_Programs.Strings;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String st = sc.next();
        StringBuilder rev= new StringBuilder(" ");
        //Method-1;
        for(int i=st.length()-1;i>=0;i--){
            rev.append(st.charAt(i));
        }
        System.out.println("Reversed String Is:"+rev);

        //Method-2;
        char[] S = st.toCharArray();
        char temp;
        int i,j;
        for(i=0,j=S.length-1;i<j;i++,j--){
            temp = S[i];
            S[i] = S[j];
            S[j] = temp;
        }
        String Reversed = new String(S);
        System.out.println("Reversed String Is: "+Reversed);
    }
}
