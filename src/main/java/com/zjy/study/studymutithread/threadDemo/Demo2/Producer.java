package com.zjy.study.studymutithread.threadDemo.Demo2;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author:zjy
 */
public class Producer extends Thread {
    ArrayBlockingQueue<String> queue;

    public Producer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("成产了面条");
                System.out.println("放了碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

