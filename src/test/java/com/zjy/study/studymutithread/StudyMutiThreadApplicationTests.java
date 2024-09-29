package com.zjy.study.studymutithread;

import com.zjy.study.studymutithread.threadDemo.Demo1.Consumer;
import com.zjy.study.studymutithread.threadDemo.Demo1.Producer;
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
}
