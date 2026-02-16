package FormulaBasedQuestions;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class FindAreaOfEquilateralTriangle {
    public static double AreaOfEquilateralTriangle(double side){
        return sqrt(3.0/4.0)*side*side;
    }
    static void main(String[] args) {
        System.out.println("Enter the length od the side of the triangle :");
        Scanner sc=new Scanner(System.in);
        double side=sc.nextDouble();
        System.out.println("Area of Equilateral triangle is : "+AreaOfEquilateralTriangle(side));
    }
}
