package xyz.pascall.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther: Jie Zhang
 * @version: ADCP v1.0
 * @date: 2019/4/18 13:28
 */
public class DemoRunnable implements Runnable {
    @Override
    public void run() {
        System.err.println("实现Runnable");
        ExecutorService service = Executors.newFixedThreadPool(2);
    }
}
