abstract class Shape{

    public abstract double area();

    public void displayArea(){

        System.out.println("Area : "+area());
    }
}

class Circle extends Shape{

    public double radius;

Circle(double radius){

    this.radius=radius;
}
@Override
public double area(){

    return radius*radius;

}

}
class Rectangle extends Shape{

public double length;
public double width;

Rectangle(double length,double width){

    this.length=length;
    this.width=width;

}
@Override
public double area(){

    return length*width;

}
}

public class PracticeAbstract {

    public static void main(String[] args){

       Circle circle= new Circle(10.0);
      
        circle.displayArea();

        Rectangle rec=new Rectangle(12.1,11.0);

        rec.displayArea();

    }
    
}






