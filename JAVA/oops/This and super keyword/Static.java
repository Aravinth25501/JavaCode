class Parent {
     int count = 0; // Static variable
    String name; // Instance variable

    Parent(String name) {
        this.name = name;
        count++; // Increment the static count variable
    }
}

class Child extends Parent {
    Child(String name) {
        super(name); // Call the constructor of the parent class
    }
}

public class Static {
    public static void main(String[] args) {
        Parent parent1 = new Parent("Parent 1");
        Parent parent2 = new Parent("Parent 2");
        Child child1 = new Child("Child 1");
        Child child2 = new Child("Child 2");

        System.out.println("Parent 1 - Name: " + parent1.name + ", Count: " + parent1.count);
        System.out.println("Parent 2 - Name: " + parent2.name + ", Count: " + parent2.count);
        System.out.println("Child 1 - Name: " + child1.name + ", Count: " + child1 .count);
        System.out.println("Child 2 - Name: " + child2.name + ", Count: " +  child2.count);
    }
}

