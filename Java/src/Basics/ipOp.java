package Basics;

import java.util.Scanner;
public class ipOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Integer...
        System.out.println("Enter A Number:");
        int a = sc.nextInt();
        System.out.println("Integer is:"+a);
        sc.nextLine();

        //String...
        System.out.println("Enter A String:");
        String St = sc.nextLine();
        System.out.println("String is:"+St);

        //Double...
        System.out.println("Enter A Float");
        float f = sc.nextFloat();
        System.out.println("Float is:"+f);
        sc.close();
    }
}
