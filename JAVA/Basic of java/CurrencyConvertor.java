 import java.util.Scanner;

public class CurrencyConvertor {
    
public static void main(String[] args){


    Scanner sc=new Scanner(System.in);

   System.out.println("Enter the currrency in INR: ");

   int ind=sc.nextInt();

   double usd=ind*0.012;

   System.out.println("The Amoutn of Rupees " + ind + " INR to USD is :" + usd +"USD");

   sc.close();
}


}
