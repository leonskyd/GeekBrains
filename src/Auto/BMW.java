package Auto;

import OOP.Cat;

public class BMW extends Car {

    private String interior;
    protected Colour colour;

    public BMW(Engine engine, String wheel, String body, String interior) {
        super(engine, wheel, body);
        this.interior = interior;

    }
    public BMW(Engine engine, String wheel, String body, String interior, Colour colour) {
        super(engine, wheel, body);
        this.interior = interior;
         this.colour= colour;}

    @Override
    public void voice() {
        System.out.println("i am the best car ever !");

    }

    @Override
    public void run() {
        super.run();
    }
}
