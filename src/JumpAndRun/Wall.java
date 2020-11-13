package JumpAndRun;

public class Wall implements Barier{

    final double MAXHEIGHT = 2.2; // maximal height

    double height;

    public Wall(double height) {
        this.height = height;
    }


    @Override
    public double getValue() {
        return this.height;
    }
}
