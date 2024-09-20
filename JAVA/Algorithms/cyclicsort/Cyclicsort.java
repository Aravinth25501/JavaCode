package Algorithms.cyclicsort;

import java.util.Arrays;

public class Cyclicsort {

    public static void main(String[] args){

        int nums[] = {6,5,67,88,23,21,3,1,56};
        
        cyclicSort(nums);

        System.out.println(Arrays.toString(nums));

        
    }

    static void swap(int[]arr,int first,int second){

        int temp=arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void cyclicSort(int[] arr){

        int i =0;

        while(i<arr.length){

        int correctindex = arr[i]-1;

        if(arr[i]!=arr[correctindex] && arr[i]<arr.length){

            swap(arr,i,correctindex);
        }else{

            i++;
        }

        }
    }
    
}
