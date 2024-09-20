package Algorithms.bobblesort.selectionsort;

import java.util.Arrays;

public class Selection {

    public static void main (String[] args){

        int [] nums = {2,3,1,2,3};

        selection(nums);

        System.out.println(Arrays.toString(nums));

    }

    static void swap(int[]arr,int first, int second){

        
            int temp = arr[first];

            arr[first]= arr[second];

            arr[second] = temp;
       

    

    }


    static void selection(int[] arr){

        for(int i = 0 ; i < arr.length ;i++){

        int last = arr.length-i-1;

        int max=getMaxIndex(arr, 0, last);

        swap(arr,max,last);



        }

    }

    static int getMaxIndex(int[] arr, int start, int end){

        int max = start;

        for(int i = start; i <=end;i++){

            if(arr[max] < arr[i]){

                max = i;

            }
        }
        return max;
    }
    
}
