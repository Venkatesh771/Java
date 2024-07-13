package Important_Programs.NumberPrograms;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Year: ");
        int Year = sc.nextInt();

        if(Year%4==0){
            if(Year%100!=0 || Year%400==0){
                System.out.println("It Is A Leap Year:");
            }
            else{
                System.out.println("It Is Not A Leap Year:");
            }
        }
        else{
            System.out.println("It Is Not A Leap Year:");
        }
    }
}
