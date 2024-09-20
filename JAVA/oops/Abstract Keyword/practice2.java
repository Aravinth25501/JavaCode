abstract class Animal{

    public String name;
    public int age;

    public abstract void makeSound(String sound);

Animal(String name,int age){

    this.name=name;
    this.age=age;

}
}
class Dog extends Animal{


Dog(String name,int age){

    super(name,age);


}
@Override
public void makeSound(String sound){

System.out.println("The Dog Sound is " +sound);

}
}

class Cat extends Dog{

    Cat(String name,int age ){

        super(name,age);//calling the constructor from the superclass

    }
@Override
public void makeSound(String sound){

    System.out.println("The Cat Sound is "+ sound ) ;
}
}
public class practice2 {
    public static void main (String[] args){

        Dog d = new Dog("jon",10);

        Cat c= new Cat("Eiza",1);

        c.makeSound("\" Miyowhhh Miyowhh \"");

        d.makeSound("\"oww owwhh\"");
    }
}
