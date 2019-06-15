package javabasic.thread;

public class YieldDemo {
//    public static void main(String[] args) {
//        Runnable yieldTask = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0 ;i <= 10; i++ ) {
//                    System.out.println(Thread.currentThread().getName() + i);
//                    if(i == 5) {
//                        Thread.yield();
//                    }
//                }
//            }
//        };
//        Thread t1 = new Thread(yieldTask, "A");
//        Thread t2 = new Thread(yieldTask, "B");
//        t1.start();
//        t2.start();
//    }
public void add(String str1, String str2) {

    StringBuilder sb = new StringBuilder();
    sb.append(str1).append(str2);
}

    public static void main(String[] args) {
        YieldDemo rmsync = new YieldDemo();
        for (int i = 0; i < 10000000; i++) {
            rmsync.add("abc", "123");
        }
    }

}
