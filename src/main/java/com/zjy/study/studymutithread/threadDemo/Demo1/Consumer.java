package com.zjy.study.studymutithread.threadDemo.Demo1;

/**
 * @Author:zjy
 */
public class Consumer extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 0) {
                        // 如果没有，就等待
                        try {
                            Desk.lock.wait();// 将当前线程和锁绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        Desk.count--;
                        System.out.println("吃完了，还剩" + Desk.count);
                        Desk.foodFlag = 0;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
