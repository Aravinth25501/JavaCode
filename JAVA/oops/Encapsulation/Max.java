import java.util.*;
public class Max {

 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the storage of the element : ");

    int len = sc.nextInt();
        
    int[] numbers = new int[len];

    for(int i=0; i<len;i++){

    System.out.println("Enter the elements : "+(i+1)+": ");

    numbers[i] = sc.nextInt();

    
    }
    
    int max = numbers[0];
    for(int num : numbers){

        if (num > max){

            max=num;
        }
        
    
    }
    int min =numbers[0];

    for(int num : numbers){

        if (num< min){

            min = num;
        }
    }

    System.out.println("Maximum number is : "+ max  );
    System.out.println("Minimum number is : "+ min);
}
}