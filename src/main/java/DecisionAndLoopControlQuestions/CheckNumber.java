package DecisionAndLoopControlQuestions;

import java.util.Scanner;

public class CheckNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();

        if(number>0)
            System.out.println("Number is positive");
        else if(number<0)
            System.out.println("Number is negative ");
        else
            System.out.println("Number is zero");
    }
}
