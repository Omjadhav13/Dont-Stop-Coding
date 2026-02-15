package DecisionAndLoopControlQuestions;

import java.util.Scanner;

public class PrintingColorName {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color code:");
        int code = sc.nextInt();

        switch (code) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Blue");
                break;
            case 3:
                System.out.println("Green");
                break;
            case 4:
                System.out.println("Yellow");
                break;
            case 5:
                System.out.println("Black");
                break;
            default:
                System.out.println("Invalid color code");
        }


    }
}
