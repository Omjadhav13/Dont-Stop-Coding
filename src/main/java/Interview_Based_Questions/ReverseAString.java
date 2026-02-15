package Interview_Based_Questions;

public class ReverseAString {
    static void main(String[] args) {
       String S1="I am a student";
       String word="";
       String result="";
       for(int i =0;i<S1.length();i++){
           if(S1.charAt(i) !=' '){
               word+=S1.charAt(i);
           }
           else{
               result=word+" "+result;
               word="";
           }

       }
        result=word+" "+result;
        System.out.println(result);
    }
}
