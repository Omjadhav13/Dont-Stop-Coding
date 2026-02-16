package FormulaBasedQuestions;

import java.util.Scanner;


    public class FindAreaOfRightAngleTriangle {

        public static double AreaOfRightAngleTriangle(double base,double height){
            return 0.5* base* height;
        }

        public static void main(String[] args) {

            System.out.println("Enter the length of base");
            Scanner sc=new Scanner(System.in);
            double base=sc.nextDouble();
            System.out.println("Enter the length of height");
            double height=sc.nextDouble();
            System.out.println("The Area of right angle triangle is "+ AreaOfRightAngleTriangle(base,height));

        }
    }
