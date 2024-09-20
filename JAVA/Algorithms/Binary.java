package Algorithms;
public class Binary{

    public static void main(String[] args){

        int[] nums={4,5,6,7,8,70,0,1,2};

        int target=1;

        int pivot=pivot(nums);
        
        int first = binary(nums,target, 0, pivot);

        if(first!=-1){

            System.out.println(first);


        }else{

            System.out.println(binary(nums,target, pivot+1, nums.length-1));
        }
        
    }

    static int pivot(int [] arr){

       int start = 0;
       int end=arr.length-1;

       while(start<=end){

        int mid = start+(end-start)/2;

        if(arr[mid]>arr[mid+1]){

            return mid;
        }
       
       }

        return start;

    }

    static int binary(int[] arr,int target, int start, int end){

        while(start<=end){

            int mid = start + (end-start)/2;

            if(arr[target] < arr[mid]){

                end=mid-1;

             }else if(arr[target]>arr[mid]){

                start = mid+1;
             }else{

                return arr[target];
             }
        }

        return -1;
    }
}

