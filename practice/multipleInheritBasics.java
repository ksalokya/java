// method - 1
interface a {
    public void printName();
}

interface b {
    public void printName();
}

class NewClass implements a, b {
    public void printName() {
        System.out.println("Multiple inheritance - Method 1");
    }
}

// method - 2
interface c extends a {
    public void showName();
}

class NewClass1 implements c {
    public void printName() {
        System.out.println("Multiple inheritance - Method 2");
    }

    public void showName() {
        System.out.println("Multiple inheritance - Method 2");
    }
}

// method - 3
class NewClass2 {
    public void getName() {
        System.out.println("Multiple inheritance - Method 3");
    }
}

class NewClass3 extends NewClass2 implements c {
    @Override
    public void getName() {
        super.getName();
    }

    public void printName() {
        System.out.println("Multiple inheritance - Method 3");
    }

    public void showName() {
        System.out.println("Multiple inheritance - Method 3");
    }
}

public class multipleInheritBasics {
    public static void main(String[] args) {
        NewClass newC = new NewClass();
        newC.printName();

        NewClass1 newC1 = new NewClass1();
        newC1.printName();
        newC1.showName();

        NewClass3 newC2 = new NewClass3();
        newC2.getName();
        newC2.printName();
        newC2.showName();
    }
}
