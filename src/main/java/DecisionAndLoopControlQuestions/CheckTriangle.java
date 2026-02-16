package DecisionAndLoopControlQuestions;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class CheckTriangle {

    public static boolean IsTriangle(double firstAngle, double secondAngle, double thirdAngle) {
        return (firstAngle + secondAngle) > thirdAngle && (firstAngle + thirdAngle > secondAngle);
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Angle:");
        double firstAngle=sc.nextDouble();

        System.out.println("Enter the second Angle:");
        double secondAngle=sc.nextDouble();

        System.out.println("Enter the third Angle:");
        double thirdAngle=sc.nextDouble();

        System.out.println(IsTriangle(firstAngle,secondAngle,thirdAngle)?"It is triangle":"It is not a triangle");
    }


}
