package com.zjy.study.studymutithread.threadDemo.Demo1;

/**
 * @Author:zjy
 */
public class Producer extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                // 如果达到了吃的最大数，就break，防止一直循环
                if (Desk.count == 0) {
                    break;
                } else {
                    //判断桌子上是否有食物
                    if(Desk.foodFlag == 1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        // 判断没有食物就开始做
                        Desk.foodFlag = 1;
                        System.out.println("厨师做了一碗面条");
                        // 叫醒消费者开吃
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
