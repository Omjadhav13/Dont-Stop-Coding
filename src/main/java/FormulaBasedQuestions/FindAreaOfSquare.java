package FormulaBasedQuestions;

import java.util.Scanner;

public class FindAreaOfSquare {
    public static float Area(float side){
        return side*side;
    }
    public static void main(String[] args){
        System.out.println("Eneter the length of the side");
        Scanner sc=new Scanner(System.in);
        float side=sc.nextFloat();
        System.out.println("Area of Square is : " + Area(side));
    }
}
