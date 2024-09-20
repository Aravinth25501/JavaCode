class Shape{

   public double calculateArea(){

    return 0;
   }
       
    }

class Rectangle extends Shape{

    private double length;
    private double width;

    Rectangle(double length,double width){

         this.length=length;
         this.width=width;

  

    }
      @Override

    public double calculateArea(){


        return length*width;
    }
}

public class Overriding {

    public static void main(String[] args){

      Rectangle r=new Rectangle(10.0,11.0);
       
      double result=r.calculateArea();

      System.out.println(result);
    }
    
}
