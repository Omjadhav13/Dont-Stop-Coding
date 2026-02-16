package Interview_Based_Questions;

public class SmallestAndLargestInArray {
    static void main(String[] args) {
        int [] arr={1,23,46,13,8,2,45};


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Largest: "+arr[arr.length-1]);

        System.out.println("Smallest: "+ arr[0]);


        int min=arr[0];
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest: "+max);

        System.out.println("Smallest: "+ min);
    }
}
