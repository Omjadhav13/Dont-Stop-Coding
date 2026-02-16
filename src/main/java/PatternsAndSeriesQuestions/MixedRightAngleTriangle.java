package PatternsAndSeriesQuestions;

public class MixedRightAngleTriangle {
    static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int k=i;k>=1;k--){
                if(k>1)
                    System.out.print("*");
                else
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
