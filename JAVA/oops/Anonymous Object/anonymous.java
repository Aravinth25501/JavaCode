

class Car{

    private String model;


    Car(String model){
          this.model=model;
    }

   void getModel(){

    System.out.println(model);


   }
}
public class anonymous {
    
public static void main (String[] args){

   new Car("BMW").getModel(); //anonymous object 
   new Car("BENZ").getModel(); //anonymous object
}
}  