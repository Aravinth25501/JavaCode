class Shape{

    String name;

    Shape(String name){
      
        this.name = name;


    }

}
class Rectangle extends Shape{

    int width;
    int height;

    Rectangle(int width,int height,String name){

         super(name);
        this.width=width;
        this.height=height;

    }

    public void displayInfo(){

        System.out.println(name);
        System.out.println(width);
        System.out.println(height);
    }

}
public class ThisKeyword {

 public static void main (String[] args){

    Rectangle r= new Rectangle(20,10,"Rectangle");
 
     r.displayInfo();
}
    
}
