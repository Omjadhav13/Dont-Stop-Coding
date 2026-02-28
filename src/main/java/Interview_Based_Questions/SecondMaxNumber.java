package Interview_Based_Questions;

public class SecondMaxNumber {
    public static void main(String[] args){
        int[] arr={10,30,20,5,40,50,45};
        int max=arr[0];
        int smax=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if (smax<arr[i] && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(smax);

    }
}
