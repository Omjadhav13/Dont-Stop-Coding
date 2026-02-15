package DecisionAndLoopControlQuestions;

import java.util.Scanner;

public class CheckLargestAmongThree {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : "+"\n");
        int firstNumber=sc.nextInt();

        System.out.print("Enter the second number : "+"\n");
        int secondNumber=sc.nextInt();

        System.out.print("Enter the third number : "+"\n");
        int thirdNumber=sc.nextInt();

        if(firstNumber>secondNumber && firstNumber>thirdNumber)
            System.out.println(firstNumber+" is Largest");
        else if(secondNumber>firstNumber && secondNumber>thirdNumber)
            System.out.println(secondNumber+ " is Largest");
        else
            System.out.println(thirdNumber+ " is Largest");
    }
}
