package DecisionAndLoopControlQuestions;

import java.util.Scanner;

public class CheckVotingEligibilty {
    public static boolean CheckEligibility(int age){
        if(age>=18)
           return true;
        else
           return false;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : "+"\n");
        int age=sc.nextInt();


        System.out.println(CheckEligibility(age)?"Your are eligible for voting.":"You are nit eligible for voting.");
    }
}
