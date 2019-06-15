package javabasic.thread.sync;

public class SyncDemo {
    public static void main(String[] args) {
        SyncThread syncThread = new SyncThread();
        Thread A1 = new Thread(syncThread, "A");
        Thread A2 = new Thread(syncThread, "A");
        Thread B1 = new Thread(syncThread, "B");
        Thread B2 = new Thread(syncThread, "B");
        Thread C1 = new Thread(syncThread, "C");
        Thread C2 = new Thread(syncThread, "C");
        A1.start();
        A2.start();
        B1.start();
        B2.start();
        C1.start();
        C2.start();
    }
}
