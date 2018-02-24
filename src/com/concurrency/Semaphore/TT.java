package com.concurrency.Semaphore;

public class TT implements Runnable {
    int b = 100;
    int flag = 0;
    TT (int t) {
        flag = t;
    }
    // 执行synchronized时，当前对象被锁定
    public synchronized void m1() throws Exception {
        b = 1000;
        System.out.println("m1: " + Thread.currentThread());
        Thread.sleep(2000);
        System.out.println("m1 b = " + b);
    }

    public synchronized void m2() throws Exception {
        System.out.println("m12 b = " + b);

        System.out.println("m2: " + Thread.currentThread());
        Thread.sleep(3500);
        b = 2000;
        System.out.println("m2 b = " + b);
    }

    public void run() {
        try {
//            if (flag == 1) {
                m1();
//            } else {
//                m2();
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        TT tt = new TT(1);
//        TT tt2 = new TT(1);
        Thread t = new Thread(tt);
//        Thread t2 = new Thread(tt2);
        t.start();
//        t2.start();


        tt.m2();  //方法调用，所以是主线程
//        System.out.println("main " + Thread.currentThread());
        System.out.println(tt.b);


    }
}
