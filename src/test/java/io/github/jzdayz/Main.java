package io.github.jzdayz;

import io.github.jzdayz.juc.SynchronousQueue;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
    @Test
    public void testSynchronousQueue() throws Exception{
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();
        new Thread(()-> Util.invoke(()->{
            Scanner scanner = new Scanner(System.in);
            System.out.println(1);
            synchronousQueue.put(scanner.next());
        })).start();
        System.out.println(synchronousQueue.take());;
    }

    public static void main(String[] args) throws Exception{
        new Main().testSynchronousQueue();
    }
}
