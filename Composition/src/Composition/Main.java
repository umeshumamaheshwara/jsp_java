package Composition;


class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    public Car() {
        // Engine is created when Car is created — Composition
        engine = new Engine();   // creating New instance
    }

    void startCar() {
        engine.start();
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();   // Car owns Engine
        myCar.startCar();        // Starts the engine
    }
}
