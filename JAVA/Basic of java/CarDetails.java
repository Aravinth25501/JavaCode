class Car{

String model;
int year;
String color;

 void  getString(String m,String c,int y){
 model=m;
 color=c;
 year=y;
  System.out.println("DETAILS ABOUT CAR:");
 System.out.println("================================");
 System.out.println("CAR MODEL :"+m);
 System.out.println("CAR COLOR :"+c);
 System.out.println("CAR YEAR :"+y);
 System.out.println("================================");
}

}


public class CarDetails {
    public static void main(String [] args){

     Car car1= new Car();

     car1.getString("BREAZZA","RED",2021);

     
 
      
    }
}
