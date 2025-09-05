package ThreadProgram;

class Demo {
    public static void m1() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("m1: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void m2() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("m2: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Testers1 extends Thread {
    public void run() {
        Demo.m1();
    }
}

class Testers2 extends Thread {
    public void run() {
        Demo.m2();
    }
}

public class Myclass3 {
    public static void main(String[] args) {
        Testers1 t1 = new Testers1();
        Testers2 t2 = new Testers2();
        t1.start();
        t2.start();
    }
}
