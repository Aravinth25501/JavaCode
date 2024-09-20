
import java.util.Scanner;
//creating subclass to assign variable
class Rectangle1{

int length;
int width;
// create a constructor to insert the values directly in the methode
Rectangle1(int length,int width){

    this.length=length;
    this.width=width;
}


}
//main class
public class Rectangle {
    
public static void main(String [] args){

 
  Scanner sc = new Scanner (System.in);

  System.out.println("enter the length of the rectangle: ");

   int length = sc.nextInt();

 System.out.println(" Enter the width of the rectangle: ");

   int width =sc.nextInt();

//creating a object to the subclass to insert the methode function
//and constructor 
Rectangle1 rec= new Rectangle1(length,width);

System.out.println("Area of rectangle is  : "+rec.length*rec.width);

sc.close();
}
}
