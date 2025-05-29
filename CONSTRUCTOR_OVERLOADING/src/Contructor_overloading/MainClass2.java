package Contructor_overloading;

public class MainClass2 
{
    MainClass2(int a) 
    {
        this("Hello");
        System.out.println("int: " + a);
    }

    MainClass2(String b) 
    {
        this("Hello", 10);
        System.out.println("String: " + b);
    }

    MainClass2(String b, int a)
    {
        System.out.println("String, int: " + b + " " + a);
    }

    public static void main(String[] args) 
    {
        MainClass2 m1 = new MainClass2(10);
    }
}
