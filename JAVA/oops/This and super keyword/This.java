
class Person {
    private String name;
    private int age;

    // Default constructor to give default values
    Person() {
        name = "unknown";
        age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
public void setName(String n){

     name=n;


}
    public  String getName(){

        return name;
    }

    public void setAge(int a ){

        age=a;
    }
   public  int getAge(){

    return age;
   

}
    public void displayInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class This extends Person {

    public This(String name, int age) {
        super();  // Call the default constructor of the superclass
        setName(name);
        setAge(age);
    }

    public static void main(String[] args) {
       

        
    }
}
