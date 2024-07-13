package Data_Structures;

import java.util.Scanner;

public class Stack {
    private final int maxSize;  // size of stack array
    private final int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; //Empty Stack
    }

    //Push Function.
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    //Pop Function.
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            top--;
            System.out.println("The Element Is Removed");
            display();
        }
    }

    //TopElement Function.
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
        } else {
            System.out.print(stackArray[top]);
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    //Display Method.
    public void display(){
        int i;
        for(i=0;i<=top;i++){
            System.out.print(stackArray[i]+" ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    int val;
                    System.out.print("Enter Value: ");
                    val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("The Stack Elements Are:");
                    stack.display();
                    break;
                case 4:
                    System.out.print("The Stack Top Element Is:");
                    stack.peek();
                    break;
                case 5:
                    System.out.println("Thank You, Have A Nice Day!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }while (choice!=5);
    }
}
