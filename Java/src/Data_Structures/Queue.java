package Data_Structures;

import java.util.Scanner;

public class Queue {
    private final int[] queue;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //Insert.
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println(item+" Is Inserted");
    }

    //Delete.
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        front = (front + 1) % capacity;
        size--;
        System.out.println(queue[front]+" Is Deleted");
    }

    public void display(){
        int i;
        System.out.print("The Queue Elements Are: ");
        for(i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("The Front Element of the Queue Is: "+queue[front]);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    int val;
                    System.out.print("Enter A Value: ");
                    val=sc.nextInt();
                    queue.enqueue(val);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    queue.peek();
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
