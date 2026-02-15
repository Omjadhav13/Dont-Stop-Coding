package DecisionAndLoopControlQuestions;

import java.util.Scanner;

public class CheckNumberAreEquivalent {

    public static boolean CheckNumberEquivalent(int numberOne,int numberSecond){
        if(numberOne==numberSecond)
            return true;
        else
            return false;

//        return numberOne==numberSecond? true:false;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int numberOne=sc.nextInt();

        System.out.println("Enter the Second Number:");
        int numberSecond=sc.nextInt();

        System.out.println(CheckNumberEquivalent(numberOne,numberSecond)?"The two number are equivalent": "The two numbers are not equivalent");
    }
}
