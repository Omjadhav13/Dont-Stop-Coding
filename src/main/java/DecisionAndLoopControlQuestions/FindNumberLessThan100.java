package DecisionAndLoopControlQuestions;

import java.util.Scanner;

public class FindNumberLessThan100 {

    public static boolean CheckNumber(int number){
//        if(number>=10)
//            return true;
//        else
//            return false;
        return number>=10? true:false;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        System.out.println("The number is "+ (CheckNumber(number)?"less than 10":"not less than 10"));
    }
}
