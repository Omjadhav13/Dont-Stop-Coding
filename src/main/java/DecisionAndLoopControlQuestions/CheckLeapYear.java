package DecisionAndLoopControlQuestions;

import java.util.Scanner;

public class CheckLeapYear {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();

        System.out.println(year%4==0 && year%100!=0|| year%400==0? " Its is leap year":"Its is not a leap year");
    }
}
