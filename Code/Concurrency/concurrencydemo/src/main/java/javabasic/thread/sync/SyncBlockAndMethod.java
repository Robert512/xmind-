package javabasic.thread.sync;

public class SyncBlockAndMethod {
    public void syncsTask(){
        System.out.println("hello");
    }
    public synchronized void syncTask(){
        System.out.println("Hello again.");
    }
}
