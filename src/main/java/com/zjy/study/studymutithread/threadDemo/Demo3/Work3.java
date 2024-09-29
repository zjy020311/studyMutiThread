package com.zjy.study.studymutithread.threadDemo.Demo3;


/**
 * @Author:zjy
 */
public class Work3 implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (this){
                if (Object3.num % 2 > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + Object3.num);
                }else if (Object3.num == 0 ){
                    break;
                }
                Object3.num--;
            }
        }
    }
}
