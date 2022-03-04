// Method 1 - runnable interface
class MyClass1 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread from MyClass1");
        }
    }
}

class MyClass2 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread from MyClass2");
        }
    }
}

// Method 2 - Thread class
class MyClass3 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread from MyClass3");
        }
    }
}

class MyClass4 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread from MyClass4");
        }
    }
}

public class multithreadingBasics {
    public static void main(String[] args) {
        // Method 1 - runnable interface
        MyClass1 c1 = new MyClass1();
        MyClass2 c2 = new MyClass2();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

        // Method 2 - Thread class
        MyClass3 c3 = new MyClass3();
        MyClass4 c4 = new MyClass4();

        c3.start();
        c4.start();

        // priority
        c3.setPriority(Thread.MAX_PRIORITY); // 10
        c3.setPriority(Thread.MIN_PRIORITY); // 0
        c3.setPriority(Thread.NORM_PRIORITY); // 5
    }
}
