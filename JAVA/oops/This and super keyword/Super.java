class Vehicle{

     int make;
     String model;

   Vehicle(String model,int make){

    this.make=make;
    this.model=model;  

}

       public void displayInfo(){
        System.out.println(model);
        System.out.println(make);

    }

}

class Car extends Vehicle{

int year;

Car(int year,String model,int make){

  
   super(model,make);//call the superclass constructor
    this.year=year;
   


}
@Override
   public void displayInfo(){
        super.displayInfo();//call the superclass methode
        System.out.println(year);
       

    }

}
public class Super {
    public static void main(String[] args){

        Car c=new Car(2019,"benz",2);
    
        c.displayInfo();
    }   
}
