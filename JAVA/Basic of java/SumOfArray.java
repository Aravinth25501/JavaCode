import java.util.Scanner;

public class SumOfArray {
 
    public static void main(String[] args){

   Scanner sc=new Scanner(System.in);

   System.out.println("enter the limit of array: ");

   int limit=sc.nextInt();

   System.out.println("Enetr the elements in the array: ");

   int arr[]=new int[limit];
    int sum=0;
   for(int i=0;i<limit;i++){

    arr [i] =sc.nextInt();

        sum+=arr[i];

    

   
}

System.out.println("sum of arrys:"+sum);

sc.close();
}

}
