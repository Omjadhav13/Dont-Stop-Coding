package PatternsAndSeriesQuestions;

public class NumberTrianglePattern {
    public static void main(String [] args){
        NumberTriangle(5);

    }
    public static void NumberTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
