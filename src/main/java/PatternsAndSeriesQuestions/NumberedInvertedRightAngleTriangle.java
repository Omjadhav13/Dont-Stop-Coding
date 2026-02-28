package PatternsAndSeriesQuestions;

public class NumberedInvertedRightAngleTriangle {
    public static void main(String[] args){
        PrintStatement(5);
    }
    public static void PrintStatement(int n){

        for(int i=0;i<n;i++){
            int num=1;
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<n;k++){
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}
