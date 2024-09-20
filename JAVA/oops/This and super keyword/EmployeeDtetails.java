class Employee{

    int id;
    String name;
    String department;

Employee(int id,String name,String department){
    
    this.id=id;
    this.name=name;
    this.department=department;

}

}
class Manager extends Employee{

int numberOfEmployees;

Manager(int numberOfEmployees,int id,String name,String department){

   super(id,name,department); // calling constructor from superclass
   this.numberOfEmployees=numberOfEmployees;

}

public void displayInfo(){

    System.out.println("The id of the employee is : "+ id);
    System.out.println("The name of the employee is  : "+name);
    System.out.println("The department of employee is : " + department);
    System.out.println("The number of employees are : "+ numberOfEmployees);
}
}
public class EmployeeDtetails {

    public static void main(String[] args){

        Manager manager=new Manager(821,10,"Hari","CSE");
        Manager manager1=new Manager(300,13,"Sudheer","ECE");
        manager.displayInfo();
        manager1.displayInfo();
    }
    
}
