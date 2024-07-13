package Data_Structures;
import java.util.*;
public class Single_LinkedList {

    private static class Node {
        String name;
        int marks;
        char grade;
        Node next;

        Node(String name, int marks, char grade) {
            this.name = name;
            this.marks = marks;
            this.grade = grade;
            this.next = null;
        }
    }

    Node head;

    public Single_LinkedList() {
        this.head = null;
    }

    // Insert At Starting.
    public void insertAtBeginning(String name, int marks, char grade) {
        Node newNode = new Node(name, marks, grade);
        newNode.next = head;
        head = newNode;
    }

    //Insert At End.
    public void insertAtEnd(String name, int marks, char grade) {
        Node newNode = new Node(name, marks, grade);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
           temp.next = newNode;
        }
    }

    //Insert At Position.
    public void insertAtPosition(String name, int marks, char grade, int position) {
        Node newNode = new Node(name, marks, grade);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    //Delete At Start.
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    // Delete At End.
    public void deleteFromEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Delete At Position.
    public void deleteFromPosition(int position) {
        if (head == null) {
            return;
        }
        if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current.next != null; i++) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    }

    //Display Method.
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name +" "+ temp.marks +" "+ temp.grade);
            temp = temp.next;
        }
    }

    //Main Method.
    public static void main(String[] args) {
        Single_LinkedList st = new Single_LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete from beginning");
            System.out.println("5. Delete from end");
            System.out.println("6. Delete from position");
            System.out.println("7. Display list");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String nameBegin = scanner.nextLine();
                    System.out.print("Enter marks: ");
                    int marksBegin = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    char gradeBegin = scanner.next().charAt(0);
                    st.insertAtBeginning(nameBegin, marksBegin, gradeBegin);
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String nameEnd = scanner.nextLine();
                    System.out.print("Enter marks: ");
                    int marksEnd = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    char gradeEnd = scanner.next().charAt(0);
                    st.insertAtEnd(nameEnd, marksEnd, gradeEnd);
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    String namePos = scanner.nextLine();
                    System.out.print("Enter marks: ");
                    int marksPos = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    char gradePos = scanner.next().charAt(0);
                    System.out.print("Enter position: ");
                    int position = scanner.nextInt();
                    st.insertAtPosition(namePos, marksPos, gradePos, position);
                    break;
                case 4:
                    st.deleteFromBeginning();
                    break;
                case 5:
                    st.deleteFromEnd();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    int pos = scanner.nextInt();
                    st.deleteFromPosition(pos);
                    break;
                case 7:
                    st.display();
                    break;
                case 8:
                    System.out.println("Thank You, Have A Nice Day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);


    }
}
