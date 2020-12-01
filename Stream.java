package Streams;

import java.util.Arrays;

public class Stream {

    static final int SIZE = 10000000;
    static final int H = SIZE/2;

    public static void main(String[] args) throws InterruptedException {
       /* Thread t;
        t = Thread.currentThread();
        System.out.println(t);
        t.setPriority(8);
        t.setName("Wish");
        System.out.println("Waiting");
        Thread.sleep(5000);*/

        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i]*Math.sin(0.2f+i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        checkArray(arr);

        System.out.println("Now using the threads");

        float[] arrB = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arrB[i] = 1;
        }

        long t3 = System.currentTimeMillis();
        float[] arrBeginning = Arrays.copyOfRange(arrB, 0, H);
        float[] arrEnd = Arrays.copyOfRange(arrB, H, SIZE);
        Stream stream = new Stream();
        var p1 = new Thread(() -> stream.methodA(arrBeginning));
        var p2 = new Thread(() -> stream.methodB(arrEnd));

        p1.start();
        p2.start();
        try{ p1.join();p2.join();}
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arrBeginning,0,arrB,0,H);
        System.arraycopy(arrEnd,0,arrB,H,H);
        long t4 = System.currentTimeMillis();
        System.out.println(t4-t3);
        checkArray(arrB);

    }

    public static void checkArray(float[] arr) {
        System.out.println(arr[2]);
        System.out.println(arr[25]);
        System.out.println(arr[77]);
    }

    private synchronized void methodA(float[]a) {
        for (int i = 0; i < H; i++) {
            a[i] = (float)(a[i]*Math.sin(0.2f+i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
        }
    }
    private synchronized void methodB(float[]b) {
        for (int i = 0; i < H; i++) {
            b[i] = (float)(b[i]*Math.sin(0.2f+i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
        }
    }



}



