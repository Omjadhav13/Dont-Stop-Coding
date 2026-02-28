package Interview_Based_Questions;

import java.awt.image.ImageProducer;
import java.sql.SQLOutput;
import java.util.*;

public class StringFrequencyCount {
    public static void main(String[] args){
        System.out.println(frequencyCount("Hello","l"));
        System.out.println(frequency("hello"));
        System.out.println(frequencyString("java is good java is powerful"));

        List<Integer> list = Arrays.asList(1,2,4,2,4,1,6,4,45,2,12,6);
        System.out.println(numberFrequency(list));

        System.out.println(checkNumberFrequency(list,6));
    }

    public static int frequencyCount(String str,String c){
        int count=0;
        char [] s=str.toCharArray();

        for(int i=0;i<s.length;i++){
            if(s[i]==c.charAt(0)){
                count++;
            }
        }
        return count;
    }
    public static Map<Character, Integer> frequency(String str){
       Map<Character,Integer> map = new HashMap<>();

       for(Character ch: str.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
       }
       return map;
    }

    public static Map<String,Integer> frequencyString(String str) {
        Map<String,Integer> map=new HashMap<>();

        for(String s:str.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return map;
    }

    public static Map<Integer, Integer> numberFrequency(List<Integer> list){
        Map<Integer,Integer> map=new HashMap<>();

        for(Integer nums:list){
            map.put(nums, map.getOrDefault(nums,0)+1);

        }
        return map;
    }

    public static String checkNumberFrequency(List<Integer> list,int num){
        int count=0;
        for(int nums:list){
            if(nums==num){
                count++;
            }
        }
        return num + " count is "+count;
    }

}
