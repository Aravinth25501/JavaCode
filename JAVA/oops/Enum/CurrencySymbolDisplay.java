import java.util.*;

enum Currency{

    USD,INR,POUND,AUD;

}

public class CurrencySymbolDisplay {

    public static void main(String [] args){
        
        Scanner sc= new Scanner(System.in);

      System.out.println("Enter the currency to display symbol : ");

      String currency =sc.nextLine().toUpperCase();

      Currency  symbol = Currency.valueOf(currency);
      
      switch(symbol){

        case USD:

        System.out.println("$");

        break;

        case AUD:

        System.out.println("A$");

        break;

        case INR:

        System.out.println("^");

        break;
        case POUND:

        System.out.println("#");
        break;
      }


    }
    
}
