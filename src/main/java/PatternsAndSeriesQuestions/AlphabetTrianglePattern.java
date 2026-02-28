package PatternsAndSeriesQuestions;

public class AlphabetTrianglePattern {
    public static void main(String[] args){
        PrintsAlphabetsTriangle(5);
    }
    public static void PrintsAlphabetsTriangle(int n){
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){//2n-1-i
                System.out.print(ch++);
            }
            System.out.println();
        }

    }
}
