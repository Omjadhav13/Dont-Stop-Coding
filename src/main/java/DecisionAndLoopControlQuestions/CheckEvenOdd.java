package DecisionAndLoopControlQuestions;

import java.util.Scanner;

public class CheckEvenOdd {

    public static boolean CheckEvenOrOdd(int number){
        return number % 2 == 0;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : "+"\n");
        int number=sc.nextInt();

        System.out.println(CheckEvenOrOdd(number)?"The number is even":"The number is false");

    }
}
