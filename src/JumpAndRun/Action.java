package JumpAndRun;

import java.util.ArrayList;

public class Action {
    public static void main(String[] args) {


        Wall wall1 = new Wall(1.0); Wall wall2 = new Wall(1.2); Wall wall3 = new Wall(0.5);

        Track track1 = new Track(100); Track track2 = new Track(410); Track track3 = new Track(80);

        Barier[] Monaco = {wall1, track1, track2, wall2};// это наша трасса номер 1
        Barier[] CatTest = {wall1, wall2, wall3};// это наша трасса номер 2

        Human human1 = new Human("Aleks", 1.5, 400);
        Cat cat1 = new Cat("Lippi", 2,50);
        Robot robot1 = new Robot("ZTX-200", 1, 500);



        //human1.passTheRace(medium);
        
        //ACTION
        System.out.println(" \n And Action \n ");


        passTheCompetition(Monaco, human1);
        System.out.println(" ");
        passTheCompetition(CatTest, cat1); // не придумал как сделать так чтобы метод прекращался если препятствие не пройдено.
    }

   public static void passTheCompetition(Barier[] A, Participant B) {
        double a = 0;
        double b = 0;
        for (Barier barier : A) {
            if (barier instanceof Wall) {
                a = barier.getValue();
                B.jumpA(a);}
            if (barier instanceof Track) {
                b = barier.getValue();
                B.runA(b);}
        }
    }

}

