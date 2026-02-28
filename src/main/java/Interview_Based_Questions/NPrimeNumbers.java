package Interview_Based_Questions;

public class NPrimeNumbers {
    public static void main(String[] args){
        int n=95;
        nPrimes(n);

    }
    public static void nPrimes(int n){
     for(int num=2;num<=n;num++){
         boolean isPrime=true;
         for(int i=2;i*i<=num;i++){
             if(num%i==0){
                 isPrime=false;
                 break;
             }
         }
         if(isPrime)
             System.out.println(num);
     }
    }
}
