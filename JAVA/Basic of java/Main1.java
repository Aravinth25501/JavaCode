class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // Calls the constructor of the superclass
    }

    @Override
    void speak() {
        System.out.println("Woof!");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        System.out.println("Name: " + myDog.name);
        myDog.speak();
    }
}
