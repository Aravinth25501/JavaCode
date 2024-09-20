import java.util.List;

public class Final {

   public static Integer findMax(List<Integer> numbers){

    int max=Integer.MIN_VALUE;

    for(Integer num : numbers){

        if(num > max){

            max=num;


        }

       
    }

         return max;
   }

   public static Integer findMin(List<Integer> numbers){

    int min=Integer.MAX_VALUE;

    for(Integer num : numbers){

        if(num<min){

            min=num;
        }
    }

     return min;
   }
      public static void main(String [] args){
      
        List<Integer> numbers = List.of(2,34,4,2,12,23,32,1);

        Integer max=findMax(numbers);

        Integer min=findMin(numbers);

        System.out.println(max);
        System.out.println(min);

      }
}
