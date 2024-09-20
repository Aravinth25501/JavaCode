class A{

    public void show(){

        System.out.println("in A show");
    }
}
class B extends A{
@Override
    public void show(){

        System.out.println("in B show");
    }

}

public class Polymorphism {
    
public static void main(String a[]){

    A obj= new A();

    obj.show();

    obj= new B();

    obj.show();

    
}

}
