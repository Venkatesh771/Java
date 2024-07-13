package Important_Programs.Strings;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String st = sc.nextLine();

        char[] S = st.toCharArray();
        int i,j;
        char temp;
        for(i=0,j=S.length-1;i<j;i++,j--){
            temp = S[i];
            S[i] = S[j];
            S[j] = temp;
        }
        String Res = new String(S);
        System.out.println("String Rev: "+Res);
        if (Res.equals(st)){
            System.out.println(st+" is A String Palindrome!");
        }
        else{
            System.out.println(st+" is Not A String Palindrome!");
        }
    }
}
