package Projects;
import java.util.*;

enum Options{

    DEPOSITE,WITHDRAW,BALANCECHECK;
}
abstract class Account{

    private int accountNo=123;
   
    private int password=123;
   
    

public int getAccountNo(){

       return accountNo;
    }

public int setAccountNo(int accountNo){


    return accountNo;
}

public int setPassword(int password){

    return password;
}
  
public int getPassword(){

    return password;
}
     
 }


 class Deposite extends Account{

      public void home(){



    Scanner sc =new Scanner(System.in);

    
    System.out.println("What service do you want \n WITHDRAW \n DEPOSITE \n BALANCECHECK \n Please choose any Option to Proceed : ");

                String fun= sc.nextLine().toUpperCase();

                    Options en= Options.valueOf(fun);

          switch(en){

            case DEPOSITE:
            System.out.println("Enter amount to deposite : ");

              double amount1=sc.nextDouble();

              deposite(amount1);
             
            break;

            case WITHDRAW:

            System.out.println("Enter amount to withdraw : ");
        
            double amounts=sc.nextDouble();
            
            withdraw(amounts);

            break;

            case BALANCECHECK:

             details();

            break;

            default :

            System.out.println("Please privide valid information");
               sc.close(); 
          }


  }


     double balance=0.000;

     
     public double getbalance(){

        return balance;
    }

    public void  deposite(double amount){

       

           balance+=amount;

           System.out.println("You Entered Amount Rupees "+amount +"is Sucessfully deposited ");
           System.out.println("Thanks for using our Bank ");
           home();
    }

    public void withdraw(double amount){

        if(amount<=balance){

         balance-=amount;

         System.out.println("Your Ammount "+amount +"is Withdrawed Successfully");
         System.out.println("Thanks for using Our Bank ");
         home();
    }else{
        System.out.println("Insufficient funds");
        home();
    }
    }
    public void details(){
        System.out.println("=========================================");
        System.out.println("Your Account Number is : "+getAccountNo());
        System.out.println("Your Account Balance is : "+getbalance());
        System.out.println("=========================================");
        home();
    }
        
 }

class Customer extends Deposite{

    public void  CheckDetails(){

        Customer cs= new Customer();

         Scanner sc =new Scanner(System.in);

      System.out.println("Enter yout account no : ");

      int acc=sc.nextInt();


      
      System.out.println("Enter yout account pass : ");

      int pass=sc.nextInt();

         if(acc==getAccountNo() && pass==getPassword()){

            cs.details();
        }
        else{
            System.out.println("========================================");            
            System.out.println("Incorrect Account Number or Password ");
            System.out.println("========================================");            

            sc.close();
        }
            
       
    }

    


}
public class Atm{

    public static void main(String[] args){
            
                     Customer n=new Customer();

                  Scanner sc=new Scanner(System.in);
                  n.CheckDetails();
                  
                 
                  sc.close();

    

           

           




     
    }
}