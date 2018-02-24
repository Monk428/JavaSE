package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//创建所需的线程，然后回收旧线程
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown(); //防止新任务提交给这个Executor
    }
}

