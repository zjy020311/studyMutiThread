package com.zjy.study.studymutithread;

import com.zjy.study.studymutithread.threadDemo.Demo1.Consumer;
import com.zjy.study.studymutithread.threadDemo.Demo1.Producer;
import com.zjy.study.studymutithread.threadDemo.Demo3.Work3;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ArrayBlockingQueue;

@SpringBootTest
class StudyMutiThreadApplicationTests {
    ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
    // 测试生产者消费者吃面条
    @Test
    void testCPD() {
        Consumer consumer = new Consumer();
        Producer producer = new Producer();

        consumer.setName("吃货");
        producer.setName("厨师");

        consumer.start();
        producer.start();
    }

    @Test
    void testCPA(){
        com.zjy.study.studymutithread.threadDemo.Demo2.Consumer consumer = new com.zjy.study.studymutithread.threadDemo.Demo2.Consumer(queue);
        com.zjy.study.studymutithread.threadDemo.Demo2.Producer producer = new com.zjy.study.studymutithread.threadDemo.Demo2.Producer(queue);
        consumer.start();
        producer.start();
    }

    @Test
    void testWork3(){
        Work3 work3 = new Work3();
        Thread thread1 = new Thread(work3);
        Thread thread2 = new Thread(work3);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();

    }
}
