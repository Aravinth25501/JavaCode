class Main {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Main obj = new Main();

        obj.setAge(12);
        obj.setName("Hari");

        System.out.println(obj.getAge() + "  " + obj.getName());
    }
}
