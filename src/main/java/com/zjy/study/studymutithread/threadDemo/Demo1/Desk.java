package com.zjy.study.studymutithread.threadDemo.Demo1;

/**
 * @Author:zjy
 */
public class Desk {
    // 是否有面条
    public static int foodFlag = 0;
    // 吃的次数
    public static int count = 10;

     public static final Object lock = new Object();
}
