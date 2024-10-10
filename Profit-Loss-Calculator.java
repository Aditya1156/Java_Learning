package firstpackage;

import java.util.Scanner;

public class evendd {
    public static void main(String[] args) {
        double cp ,sp ,loss ,profit ;
        System.out.println("Enter the cost price :");
        Scanner sc=new Scanner(System.in);
        cp= sc.nextInt();
        System.out.println("Enter the selling price :");
        sp =sc.nextInt();
        
        if (cp>sp){
            System.out.println("Same on you !! You had make a loss today");
            loss = cp -sp ;
            System.out.println("Loss:"+loss);
        } 
        
        else if (cp==sp) {
            System.out.println("Good ! Today Neither Profit nor loss");
            
        }
        else{
            System.out.println("Hurray !! Nice job you had done some profit today");
            profit = sp-cp;
            System.out.println("Profit:"+profit);
        }

    }
}
