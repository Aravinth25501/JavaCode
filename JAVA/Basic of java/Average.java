import java.util.*;

public class Average{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int n=sc.nextInt();

System.out.println("Enter the value of n : ");

int sum=0;



for(int i=0;i<n;i++){
System.out.println("enter number ");
int number=sc.nextInt();

sum+=number;

}
double result =(double) sum/n;

System.out.println(result);

sc.close();
}
    
}