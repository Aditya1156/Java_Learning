package firstpackage;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n= sc.nextInt();
        for (int i=0; i<=n ;i++){
            System.out.println(i);
        }



    }
}
