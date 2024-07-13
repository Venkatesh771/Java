package Important_Programs.Strings;

import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String st = sc.nextLine();

        System.out.println("Your String Is: "+st);
        int length = st.length();
        System.out.println("length of the string Is: "+length);
    }
}
