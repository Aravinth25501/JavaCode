class Perimeter{

 int a;
 int b;
 int c;

 Perimeter(int a,int b,int c){

  this.a=a;
  this.b=b;
  this.c=c;

 }

}


public class PerimeterOfTringle {
    
 public static void main(String[] args){

    int a=10;
    int b=10;
    int c=10;

    Perimeter area =new Perimeter(a,b,c);

    System.out.println("The perimeter of triangle is "+(area.a+area.b+area.c));

 }

}
