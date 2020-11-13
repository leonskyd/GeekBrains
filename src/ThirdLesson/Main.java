package ThirdLesson;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) /*throws IOException*/ {

        TestOverload(1,32,15,3);
        testConsoleInput();
        testRandom();
    }

    private static void testRandom() {

        Random random = new Random();

        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(3) + 3;
            data[i] = random.nextInt(12) - 5;

            data[i] = (int)Math.random() * 10 + 1;


        }
        System.out.println(Arrays.toString(data));

    }




    private static void testConsoleInput() /*throws IOException*/ {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            System.out.println("You are fucked");
            e.printStackTrace();
        }
        System.out.println("Hello " + name);
       /* String name = reader.readLine();
        System.out.println("Hello " + name);*/

        /*Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();*/

    }




    private static int TestOverload(int... a) {
        int multiple = 1;
        for (int i : a) {
            multiple += i;
        }
        System.out.println(multiple);
        return multiple;
    }
}
