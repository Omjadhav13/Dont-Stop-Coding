package BasicPatternsForLogic;

public class MixOfNumbersAndAlphabets {
    static void main(String[] args) {
        for(int i=1;i<=5;i++){
//            System.out.print(i);
            char ch = 'A';
            for(int j=0;j<=i;j++){
                if(j==0) {
                    System.out.print(i);
                }
                else {
                    for (int k = 1; k <j; k++){
                        System.out.print(ch++);
                    }
                }
            }
            System.out.println();

        }

    }
}
