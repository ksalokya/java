class People {
    private String name;
    private int age;
    private int dob;

    People(int age) {
        this.age = age;
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
}

class Student extends People {
    private int roll;
    private char section;

    // sets to 45
    Student() {
        super(45);
    }

    void getData(String name, int age, int dob, int roll, char section) {
        super.getData(name, age, dob);
        this.roll = roll;
        this.section = section;
    }

    void showData() {
        super.showData();
        System.out.println("Roll " + roll);
        System.out.println("Section : " + section);
    }
}

public class inheritanceBasics {
    public static void main(String[] args) {
        Student s = new Student();
        s.getData("hello", 12, 2000, 1234, 'B');
        s.showData();
    }
}