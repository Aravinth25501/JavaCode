import java.util.Scanner;
enum Season{

    SPRING,WINTER,SUMMER;
}



public class Weather {

    public static void main(String [] args){


         Scanner sc = new Scanner(System.in);

       System.out.println("Enter the season to get the degree celcious of temperature of a particular season: ");

       String word = sc.nextLine().toUpperCase();

       Season se = Season.valueOf(word);

        switch(se){

            case SUMMER:
            System.out.println("32 degree");
            break;
            case WINTER:
            System.out.println("20 degree");
            break;
            case SPRING:
            System.out.println("40 degree");
            break;

        }


    }
    
}
