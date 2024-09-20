import java.util.*;
public class PrintLargestNo {
    public static void main(String[] args){

Scanner sc =new Scanner (System.in);
int largestno=Integer.MIN_VALUE;

System.out.println("Enter the numbers : ");

while(true){

int num=sc.nextInt();

if(num>largestno){

    largestno=num;

}

if(largestno != Integer.MIN_VALUE){
System.out.println(" number is : "+largestno);
    }

if(num<=0){

    break;
}


}
sc.close();
    }
    
}
