package FormulaBasedQuestions;

import java.util.Scanner;

public class FindSimpleInterest {
    static SimpleInterest simpleInterest= (double principle,double rate,double time)-> { return (principle*rate*time)/100.0; };
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        double principle=sc.nextDouble();

        System.out.println("Enter the rate of interest in % :");
        double rate=sc.nextDouble();

        System.out.println("Enter the time period in years:");
        double time=sc.nextDouble();

        System.out.println("The simple interest on the amounr "+principle+" id "+simpleInterest.interestCalculator(principle,rate,time));

        System.out.println("Your total amount is "+ (principle+simpleInterest.interestCalculator(principle,rate,time)));
    }
}
