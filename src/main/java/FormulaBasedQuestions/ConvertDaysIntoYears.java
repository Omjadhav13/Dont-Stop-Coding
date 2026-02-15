package FormulaBasedQuestions;

import java.util.Scanner;

public class ConvertDaysIntoYears {

    public static double DaysIntoYears(int days){
        return days/365.0;
    }
    static void main(String[] args) {
        System.out.println("Enter the number of days");
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        System.out.println("Number of years is : "+DaysIntoYears(days));
    }
}
