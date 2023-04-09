import java.util.Arrays;

public class test122 {
    public static void main(String[] args) {
        String s="helloWorlD";
        int l= s.length(); 
        System.out.print(is_upper(s, l, 0));
     }
  static char is_upper(String s, int l, int i){
            if(i==l){
                return ' ';
            }
         int  ch= s.charAt(i);
         if(ch>=65 && ch<=90){
             return s.charAt(i);
         }
      return is_upper(s, l, ++i);
  }
}