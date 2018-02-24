package com.concurrency;

import java.util.concurrent.TimeUnit;
//后台线程  如果main执行完的话，没有前台线程，程序就结束了。所以设置了175毫秒去执行后台线程
public class SimpleDaemons implements Runnable{
    public void run() {
        try {
            while(true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.err.println("Sleep() interrupted");
        }
    }
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);//设置为后台
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
