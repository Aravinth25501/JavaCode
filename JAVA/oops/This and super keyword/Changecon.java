class Animals{

    String sound;

    Animals(String sound){

        this.sound="Animal sound";
        
}

}

class Dog extends Animals{

    Dog(String sound){

        super(sound);

        this.sound=sound;

    }
    
}
public class Changecon {

    public static void main(String[] args){

        Dog d =new Dog("dog sound");

        System.out.println(d.sound);
    }
    
}
