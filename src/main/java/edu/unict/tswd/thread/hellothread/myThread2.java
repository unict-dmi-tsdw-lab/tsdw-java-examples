package edu.unict.tswd.thread.hellothread;
// Inspired by www.dmi.unict.it/tramonta/lessons/sd/jthread.tar

public class myThread2 extends Thread {
    myThread2() {

        System.out.println("myThread constructor");
    }
    public void run() {
        // Starting
        System.out.println("In run di myThread");
        Thread t = Thread.currentThread();
        System.out.println("myThread running pid "+t.toString());
        System.out.println(t.getName());
        for (int i = 0; i < 10000000; i++) {
            System.out.println("\t\t>");
        }
    }
}
