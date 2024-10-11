package firstpackage;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the value of a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char op = sc.next().charAt(0); // changed from String to char for switch

        switch (op) {
            case '+':
                System.out.printf("Result: %d%n", a + b);
                break; // Added break
            case '-':
                System.out.printf("Result: %d%n", a - b);
                break; // Added break
            case '*':
                System.out.printf("Result: %d%n", a * b);
                break; // Added break
            case '/':
                if (b != 0) {
                    System.out.printf("Result: %d%n", a / b);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break; // Added break
            default:
                System.out.println("Error: Invalid operator. Please retry.");
        }

        sc.close(); // close scanner
    }
}
