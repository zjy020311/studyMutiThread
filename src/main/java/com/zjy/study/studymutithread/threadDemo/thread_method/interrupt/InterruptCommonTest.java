package com.zjy.study.studymutithread.threadDemo.thread_method.interrupt;

/**
 * @Author:zjy
 */
public class InterruptCommonTest {
    public static void main(String[] args) throws Exception {
        Thread t2 = new Thread(()->{
            while(true) {
                Thread current = Thread.currentThread();
                boolean interrupted = current.isInterrupted();
                if(interrupted) {
                    System.out.println(" 打断状态: {}" + interrupted);//打断状态: {}true
                    break;
                }
            }
        }, "t2");
        t2.start();
        Thread.sleep(500);
        t2.interrupt();
    }
}
