abstract class BankAccount{

    private String name;
    
    protected double balance=0.0;
    
    public abstract double deposite(double amount);

    public abstract double withdraw(double ampunt);

    public void displayInfo(){

System.out.println(balance);

    }

    public static double getBalance(double balance){

        return balance;
    }
}
class SavingAccount extends BankAccount{

    public double deposite(double amount){

        
        balance +=amount;

        return balance;
    }
    public double withdraw(double amount){

        balance-=amount;

        return balance;

    }
}
public class Bank {
    public static void main(String[] args){

        SavingAccount bank=new SavingAccount();

        double deposite = bank.deposite(100);

        System.out.println("amount deposited successsfully  "+deposite);

        double withdraw = bank.withdraw(30);

        System.out.println("Your withdraw is successfull and now yor account balance is " + withdraw);
   
        bank.displayInfo();
    }
}
