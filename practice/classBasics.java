import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private int dob;

    // default constructor
    Person() {
        name = "";
        age = 0;
        dob = 0;
    }

    // parameterized constructor
    Person(String name, int age, int dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    void getData(String name, int age, int dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    void showData() {
        System.out.println("Name " + name);
        System.out.println("Age : " + age);
        System.out.println("D.O.B : " + dob);
    }

    public void finalize() {
        System.out.println("finalize method overriden");
    }

}

class classBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person newPerson = new Person();

        String name = sc.nextLine();
        int age = sc.nextInt();
        int dob = sc.nextInt();
        sc.close();

        newPerson.getData(name, age, dob);
        newPerson.showData();

        // garbage collection
        Person newPerson1 = new Person();
        newPerson1 = null;
        System.gc();
    }
}