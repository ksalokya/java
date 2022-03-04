abstract class Vehicle {
    String name;

    void getName(String name) {
        this.name = name;
    }

    public abstract void showDetails();
}

class BMW extends Vehicle {
    void getDetails(String name) {
        super.getName(name);
    }

    public void showDetails() {
        System.out.println("BMW : " + name);
    }
}

class Audi extends Vehicle {
    void getDetails(String name) {
        super.getName(name);
    }

    public void showDetails() {
        System.out.println("Audi : " + name);
    }
}

public class abstractClassBasics {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.getDetails("X5");
        b.showDetails();

        Audi a = new Audi();
        a.getDetails("A8");
        a.showDetails();
    }
}
