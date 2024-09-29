package com.zjy.study.studymutithread.threadDemo.Demo2;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author:zjy
 */
public class Consumer extends Thread {
    ArrayBlockingQueue<String> queue;

    public Consumer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                queue.take();
                System.out.println("吃了碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
