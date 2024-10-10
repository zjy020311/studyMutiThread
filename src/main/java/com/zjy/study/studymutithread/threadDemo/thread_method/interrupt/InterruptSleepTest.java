package com.zjy.study.studymutithread.threadDemo.thread_method.interrupt;

/**
 * @Author:zjy
 */
public class InterruptSleepTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t1");
        t1.start();
        Thread.sleep(500);
        t1.interrupt();
        System.out.println(" 打断状态: " + t1.isInterrupted());// 打断状态: false
    }
}
