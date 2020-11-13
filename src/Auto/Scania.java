package Auto;

public class Scania extends Car{

    private String frame;
    public Scania(Engine engine, String wheel, String body, String frame) {
        super(engine, wheel, body);
        this.frame = frame;
    }

    @Override
    public void voice() {
        System.out.println("i am strong !");
    }
}
