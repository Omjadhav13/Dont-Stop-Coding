package Interview_Based_Questions;

import java.util.ArrayList;
import java.util.List;

public class FourthLargest {
    public static void main(String[] args){
        List<Integer> lists=new ArrayList<>();
        lists.add(1);
        lists.add(425);
        lists.add(31);
        lists.add(52);
        lists.add(23);
        lists.add(89);
        System.out.println(fourthLFromList(lists));

        int [] arr={1,425,31,52,23,89};
        System.out.println(fourthLFromArray(arr));
    }
    public static int fourthLFromList(List<Integer> lists){
        int fourth=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;
        int third =Integer.MIN_VALUE;


        for(int nums:lists){
            if(nums>largest){
                fourth=third;
                third=second;
                second=largest;
                largest=nums;

            } else if (nums>second && nums!=largest) {
                fourth=third;
                third=second;
                second=nums;
            } else if (nums>third && nums!=largest && nums!=second) {
                fourth=third;
                third=nums;
            } else if (nums>third && nums>third && nums!=largest && nums!=second) {
                fourth=nums;
            }
        }
        return fourth;
    }
    public static int fourthLFromArray(int [] arr){
        int largest=arr[0];
        int second=arr[0];
        int third=arr[0];
        int fourth=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest){
                fourth=third;
                third=second;
                second=largest;
                largest=arr[i];
            } else if (arr[i]>second ) {
                fourth=third;
                third=second;
                second=arr[i];
            } else if (arr[i]>third ) {
                fourth=third;
                third=arr[i];
            } else if (arr[i]>fourth ) {
                fourth=arr[i];
            }
        }
        return fourth;
    }
}
