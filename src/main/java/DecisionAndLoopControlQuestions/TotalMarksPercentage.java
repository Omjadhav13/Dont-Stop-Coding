package DecisionAndLoopControlQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class TotalMarksPercentage {

    public static int TotalMarks(int [] marks){
        int totalMarks=0;
        for (int i=0;i<marks.length;i++){
            totalMarks+=marks[i];
        }
        return totalMarks;
    }
    public static double Percentage(int [] marks){
        return ((TotalMarks(marks)*100.0)/(marks.length*100.0));
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total subject :");
        int subjects=sc.nextInt();

        int [] marks=new int[subjects];
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the marks of " +(i+1)+" subject");
            marks[i]=sc.nextInt();
        }

        System.out.println("Total marks is "+TotalMarks(marks) +" and percentage is "+ Percentage(marks)+"%");

    }
}
