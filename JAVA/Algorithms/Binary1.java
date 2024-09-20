package Algorithms;

public class Binary1 {

    public static int binarSearch(int[]arr, int target){

        int start=0;
        int end=arr.length-1;

        while(start<end){

            int mid = start + (end-start)/2;

            if(arr[mid]>= target){

                end = mid-1;

            }
            else if(arr[mid] < target){

                start = mid+1;

            }
           
        }
        return end;
    }

    public static void main(String[] args) {

        int [] nums = {2,3,5,9,14,16,17,18,20,21};

        int target = 19;

        int result = binarSearch(nums, target);

        System.out.println(result);


        


    }
    
}
