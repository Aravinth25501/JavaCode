import java.util.Random;
import java.util.Scanner;

public class GussingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(Systme.in);

        System.out.println("Enter gussing Number: ");

        int humanNumber = sc.nextInt();
        
        Random random = new Random();

        int min = 1;
        int max = 100;

        int randomNumber = random.nextInt((max-min)+1)+min;

        if(humanNumber==randomNumber){
            System.out.println("you won...");
        }else{
            System.out.println("Better Luck Next Time!");
        }


    }
    
}
