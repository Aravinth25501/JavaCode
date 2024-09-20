package Algorithms;

import java.util.ArrayList;

public class PrimeNumberInArray {
    

    public static void main(String[] args){
        
      int[] nums={21,3,4,2,1,5,6,7,56,78,90,100,101};

      ArrayList<Integer> list= new ArrayList<Integer>();

      for(int i =0; i<nums.length;i++){

      if(nums[i]<=1){

        continue;
      }
      
      if(nums[i]==2){

       list.add(nums[i]);

      }
      else{

        boolean isPrime=true;

        for(int j = 2;j <= Math.sqrt(nums[i]);j++){

            if(nums[i]%j==0){

               isPrime=false;

               break;

            }
          
        }

        if(isPrime){

            list.add(nums[i]);
        }
        else{

            continue;
        }
    }

    }

    System.out.println(list);



   
}
    
}
