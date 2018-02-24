package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// 线程数为1的FixedThreadPool
public class SignleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
