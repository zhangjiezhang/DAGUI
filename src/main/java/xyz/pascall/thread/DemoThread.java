package xyz.pascall.thread;

/**
 * @auther: Jie Zhang
 * @version: ADCP v1.0
 * @date: 2019/4/18 13:27
 */
public class DemoThread extends Thread {

    @Override
    public void run() {
        System.err.println("继承Thread");
    }
}
