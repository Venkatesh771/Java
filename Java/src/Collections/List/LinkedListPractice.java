package Collections.List;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> Li = new LinkedList<>();
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

            switch (choice) {
                case 1:
                    System.out.print("Enter a element to insert at first: ");
                    int firstElement = scanner.nextInt();
                    Li.addFirst(firstElement);
                    System.out.println("Element inserted at beginning.");
                    break;

                case 2:
                    System.out.print("Enter a element to insert at last: ");
                    int lastElement = scanner.nextInt();
                    Li.addLast(lastElement);
                    System.out.println("Element inserted at end.");
                    break;

                case 3:
                    System.out.print("Enter a position: ");
                    int pos = scanner.nextInt();
                    if (pos < 0 || pos > Li.size()) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    System.out.print("Enter a element: ");
                    int element = scanner.nextInt();
                    Li.add(pos, element);
                    System.out.println("Element inserted at position " + pos);
                    break;

                case 4:
                    if (!Li.isEmpty()) {
                        System.out.println("First element deleted: " + Li.getFirst());
                        Li.removeFirst();
                    } else {
                        System.out.println("List is empty!");
                    }
                    break;

                case 5:
                    if (!Li.isEmpty()) {
                        System.out.println("Last element deleted: " + Li.getLast());
                        Li.removeLast();
                    } else {
                        System.out.println("List is empty!");
                    }
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    int delPos = scanner.nextInt();
                    if (delPos < 0 || delPos >= Li.size()) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    Li.remove(delPos);
                    System.out.println("Element deleted from position " + delPos);
                    break;

                case 7:
                    System.out.println("Current List: " + Li);
                    break;

                case 8:
                    System.out.println("Thank you! Have a nice day!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
