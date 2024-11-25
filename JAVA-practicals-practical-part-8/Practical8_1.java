
import java.util.ArrayList;
import java.util.Scanner;

class myStack {
    private static final ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
        return list.isEmpty();
    }

    public static void push(int x) {
        list.add(x);
    }

    public static int pop() {
        return list.removeLast();
    }

    public static int peek() {
        return list.getLast();
    }

    public static int getSize() {
        return list.size();
    }
}

public class Practical8_1 {
    private static void mainMenu() {
        System.out.println("Choose an option : ");
        System.out.println("1. Push an element");
        System.out.println("2. Pop an element");
        System.out.println("3. Peek an element");
        System.out.println("4. Is empty");
        System.out.println("5. Size");
        System.out.println("6. Exit");
        System.out.print("Enter your choice : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            mainMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the element to be pushed : ");
                    int x = sc.nextInt();
                    myStack.push(x);
                }
                case 2 -> System.out.println("Popped element : " + myStack.pop());
                case 3 -> System.out.println("Element peeked : " + myStack.peek());
                case 4 -> System.out.println("Is empty : " + myStack.isEmpty());
                case 5 -> System.out.println("Size : " + myStack.getSize());
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }

        } while (choice != 6);

    }
}