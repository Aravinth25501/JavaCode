package oops.String;
import java.util.*;

class Car{

    int model;
    String name;

    Car(int model,String name){

        this.model=model;
        this.name=name;
    }
}

public class Text{
    public static void main(String[]args){

        Car car = new Car(2023,"tesla");

        

        System.out.println(car.name+"\n"+car.model);


    }
}