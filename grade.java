package firstpackage;

import java.util.Scanner;

public class evendd {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner sc= new Scanner(System.in);
        int marks =sc.nextInt();
        if (marks >=81 && marks<=100 ){
            System.out.println("Very Good");
        }
        else if (marks >= 61 && marks <=80 ) {
        System.out.println("Good");
        } else if (marks >= 41 && marks<=60) {
            System.out.println("Average");
        }
        else
            System.out.println("Fail");
        sc.close();

    }
}
