import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lcm{

 public static void main(String[] args){
   
   System.out.println(subsequence("", "abc"));
   System.out.println(ascii("", "abc"));
   asci('a');

 }

 static ArrayList<String> subsequence(String p , String up){

   ArrayList<String> list = new ArrayList<>();

   if(up.isEmpty()){

      list.add(p);

      return list;

   }

    char ch = up.charAt(0);

     ArrayList<String> second = subsequence(p+ch, up.substring(1));
     ArrayList<String> first = subsequence(p, up.substring(1));
     

     second.addAll(first);
     

     return second;



 }

   static ArrayList<String> ascii(String p , String up){

      ArrayList<String> list = new ArrayList<>();
      if(up.isEmpty()){
        list.add(p);
        return list;
      }

      char ch = up.charAt(0);

      ArrayList<String> f = ascii(p+(int)ch+ch, up.substring(1));
      ArrayList<String> s = ascii(p, up.substring(1));
      f.addAll(s);
      return f;

 }

 static void asci (char ch){

   System.out.println(ch+0);
 }

}
