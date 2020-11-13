package JumpAndRun;

public class Participant {

    String name;
    double jump;
    int run;


    public Participant(String name, double jump, int run) {
        this.name = name;
        this.jump = jump;
        this.run = run;}

    public void runA(double distance) {
        if (run >= distance) {
            System.out.println(name + " is running !");
        } else {
            System.out.println(name + " cannot run this distance, the race is over !");
        }
    }

    public void jumpA(double height) {
        if (jump >= height) {
            System.out.println(name + " is jumping over !");
        } else {
            System.out.println(name + " cannot jump over this height, the race is over !");
        }
    }
}


