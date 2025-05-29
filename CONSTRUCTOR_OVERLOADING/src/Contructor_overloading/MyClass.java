package Contructor_overloading;

interface Sample1 
{
    void sampleMethod();
}

interface Tester1 {
    void testerMethod();
}

interface Driver 
{
    void driverMethod();
}

class MyClass implements Sample1, Tester1, Driver {

    public void sampleMethod() {
        System.out.println("Sample method executed");
    }

    public void testerMethod() {
        System.out.println("Tester method executed");
    }

    public void driverMethod() {
        System.out.println("Driver method executed");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.sampleMethod();
        obj.testerMethod();
        obj.driverMethod();
    }
}

