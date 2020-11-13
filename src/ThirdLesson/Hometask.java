package ThirdLesson;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hometask {

    
    public static void main(String[] args) {


    GuessNumber();
     System.nanoTime();

    }

    private static void GuessNumber() {
        while (true) {
        System.out.println("I am asking you to guess a number from 0 till 9 \n" +
                "You will have 3 attempts to do it");

        int answer = TestRandom();

        for (int i = 0; i < 3; i++) {
            int userAnswer = getInput();
            if (answer == userAnswer) {
                System.out.println("You did it !");
                break;
            } else if (userAnswer > answer) {
                System.out.println("Your number is too big. Try again");
            } else {
                System.out.println("Your number is too small. Try again");
            }
        }

            System.out.println("Do you want to quit y/n ?" );
            Scanner sc = new Scanner(System.in);
            if (sc.next().equals("y")) {
                break;
            } else {
                continue;
            }
}

    }

    private static int TestRandom() {
        Random random = new Random();

        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10);
        }

        return data[5];
    }

    private static int getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("please print the number: ");

        int number = sc.nextInt();
        return number;
    }


}




