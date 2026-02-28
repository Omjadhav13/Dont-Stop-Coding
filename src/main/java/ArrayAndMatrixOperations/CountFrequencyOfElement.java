package ArrayAndMatrixOperations;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfElement {
    public static void main(String[] args){
        int [] arr={1, 2, 2, 3, 3, 3, 4, 4, 4, 4,4,4, 5, 5, 5, 5, 5};
        countFrequency(arr);
        counts(arr);
    }
    public static void countFrequency(int [] arr){

        int TotalCount=0;
        int number=0;
        for(int i=0;i<arr.length;i++){
            int Count=0;
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    Count++;
                    number=arr[i];
                }
            }
            if(TotalCount<Count)
                TotalCount=Count;
        }
        System.out.println("Frequency is "+TotalCount +" of element " +number);
    }

    public static void counts(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int maxCount=0;
        int number=0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                number=entry.getKey();
            }
        }
        System.out.println("Frequency is "+maxCount+" of element "+number);
    }
}
