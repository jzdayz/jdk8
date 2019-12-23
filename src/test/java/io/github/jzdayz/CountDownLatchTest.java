package io.github.jzdayz;

import io.github.jzdayz.juc.CountDownLatch;

import java.util.Scanner;

public class CountDownLatchTest {

    public static void main(String[] args) throws Exception{
        test1();
    }

    public static void test1() throws Exception{
        Scanner scanner = new Scanner(System.in);
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(()->{
            System.out.println("thread.");
            scanner.next();
            countDownLatch.countDown();
        }).start();
        countDownLatch.await();
        System.out.println("done.");
    }

}
