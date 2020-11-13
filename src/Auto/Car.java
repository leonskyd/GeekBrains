package Auto;

public abstract class Car {

    private Engine engine;
    private String wheel;
    private String body;

    public Car(Engine engine, String wheel, String body) {
        this.engine = engine;
        this.wheel = wheel;
        this.body = body;
    }

    public void run() {
        turnKey();
        startEngine();
        turnOnGear(1);

    }
    private void startEngine() {
        System.out.println("It is started");
        engine.start = true;
    }
    private void turnKey() {
        System.out.println("key is turned");
    }

    private void turnOnGear(int gear) {
        if (gear < 0 || gear > 6) {
            System.out.println("it is failed !");
            System.exit(0);
        }
        System.out.println(" Go");
    }

    public abstract void voice();


}
