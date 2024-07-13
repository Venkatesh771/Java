package Basics;

import java.util.Scanner;

public class Controlflow1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");

        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Your Eligible To Vote");
        }
        else{
            System.out.println("Your Not Eligible To Vote");
        }
    }
}
