package com.zjy.study.studymutithread.threadDemo.Demo3;


/**
 * @Author:zjy
 */
public class Work3 implements Runnable {
    static int NUM = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (this){
                if (NUM % 2 > 0) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ":" + NUM);
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }else if (NUM == 0 ){
                    break;
                }
                NUM--;
            }
        }
    }
}

