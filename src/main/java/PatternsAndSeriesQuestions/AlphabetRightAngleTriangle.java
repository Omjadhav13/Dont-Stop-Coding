package PatternsAndSeriesQuestions;

public class AlphabetRightAngleTriangle {
    public static void main(String[] agrs){
        for(int i=1;i<=5;i++){
            char ch='A';
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print( ch++);
            }
            System.out.println();
        }
    }
}
