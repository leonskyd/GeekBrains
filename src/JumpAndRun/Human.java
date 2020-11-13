package JumpAndRun;

public class Human extends Participant{


    String name;
    double jump;
    int run;

    public Human(String name, double jump, int run) {
        super(name, jump, run);

    }

    /*public void passTheObjects(double a, double b) {
            jumpA(a);
            if(jump < a) return;
            runA(b);
            if(run < b) return;
        System.out.println(name + " had finished the race !");

    }*/


    /*public void passTheRace(double[] a) {
        int i = 0;
        do {
            jumpA(a[i]);
            if (jump < a[i]) break;
            i++;
        } while (i < a.length);
    }*/


}
