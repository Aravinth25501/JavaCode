abstract class Car{

    public abstract void drive();
    public abstract void playMusic();


}
class Bmw extends Car{
@Override
    public void drive(){

        System.out.println("driving");


    }
@Override
    public void playMusic(){

        System.out.println("Music is Playing");
    }
}
public class Abstract {

    public static void main(String[] args){

        Bmw car =new Bmw();
        
        car.drive();
        car.playMusic();
        
    }
    
}
