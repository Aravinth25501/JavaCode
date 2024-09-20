package Algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        
      int[] nums = {1,2,3,5,3};

     // int target = 6;

      int result = binary(nums);

      System.out.println(result);

    }
    
    public static int binary(int[] arr){

        int start =0;
        int end = arr.length-1;

        while(start <= end ){

            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){

                end = mid-1;
            }

            else if(arr[mid]<arr[mid+1]){

                start = mid+1;
            }
           
        }
return start;


    }
}
