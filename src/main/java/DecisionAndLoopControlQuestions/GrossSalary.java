package DecisionAndLoopControlQuestions;

import java.util.Scanner;

public class GrossSalary {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary:");
        double salary = sc.nextDouble();

        if(salary>50000)
            System.out.println("Gross salary is : "+(salary+000));
        else if(salary>25000)
            System.out.println("Gross salary is : "+(salary+100));
        else if(salary>10000)
            System.out.println("Gross salary is : "+(salary+500));
    }
}
