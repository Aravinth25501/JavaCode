package Algorithms;

public class LinearSearch {

    public static int linearSearch(int[] arr , int target){

        for(int i =0; i < arr.length ; i++){

            if(arr[i]==target){

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        

        int[] nums = {1,2,3,45,6,677,89,76,5,1};

        int target= 677;

        int result = linearSearch(nums, target);

        System.out.println(result);



    }
    
}
