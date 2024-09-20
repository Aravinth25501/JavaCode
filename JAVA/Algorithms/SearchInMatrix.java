package Algorithms;

import java.util.Arrays;

public class SearchInMatrix {

    public static void main(String[] args){

        int [][] matrix = {

            {10,20,30,40},
            {50,60,70,80},
            {90,100,101,102},
            {103,104,108,109}

        };

        int target = 108;

        System.out.println(Arrays.toString(search(matrix, target)));

       
    }

    static int[] search(int[][] arr,int target){

        int row=0;
        int col = arr.length-1;

        while(row<arr.length&&col>0){

            if(arr[row][col]==target){

                return new int[] {row,col};
            }
            if(arr[row][col]>target){

                col--;

            }
            if(arr[row][col]<target){

                row++;
            }
        }

        return new int[]{-1,-1};
    }
    
}
