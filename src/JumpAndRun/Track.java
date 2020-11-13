package JumpAndRun;

public class Track implements Barier{
    final double LONG = 500; // maximal length

    double distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public double getValue() { return this.distance;}
}
