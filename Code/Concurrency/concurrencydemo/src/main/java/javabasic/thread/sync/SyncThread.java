package javabasic.thread.sync;

import java.text.SimpleDateFormat;
import java.util.Date;
public class SyncThread implements Runnable{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if(threadName.startsWith("A")){
            async();
        }else if(threadName.startsWith("B")){
            syncObjectBlock1();
        }else if(threadName.startsWith("C")){
            syncObjectMethd1();
        }
    }

    private void async() {
        try {
            System.out.println(Thread.currentThread().getName()+"_Async_start:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"_Async_end:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void syncObjectBlock1() {
        System.out.println(Thread.currentThread().getName()+"_syncObjectBlock1_:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
        synchronized (this) {
            try {
                System.out.println(Thread.currentThread().getName()+"_syncObjectBlock1_start:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"_syncObjectBlock1_end:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void syncObjectMethd1() {
        System.out.println(Thread.currentThread().getName()+"_syncObjectMethd1_:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
        try {
            System.out.println(Thread.currentThread().getName()+"_syncObjectMethd1_start:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"_syncObjectMethd1_end:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void syncClassBlock1() {
        System.out.println(Thread.currentThread().getName()+"_syncClassBlock1_:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
        synchronized (SyncThread.class) {
            try {
                System.out.println(Thread.currentThread().getName()+"_syncClassBlock1_start:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"_syncClassBlock1_end:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized static void syncClassMethd1() {
        System.out.println(Thread.currentThread().getName()+"_syncObjectMethd1_:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
        try {
            System.out.println(Thread.currentThread().getName()+"_syncObjectMethd1_start:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"_syncObjectMethd1_end:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
