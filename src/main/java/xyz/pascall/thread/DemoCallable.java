package xyz.pascall.thread;

import java.util.concurrent.Callable;

/**
 * @auther: Jie Zhang
 * @version: ADCP v1.0
 * @date: 2019/4/18 13:29
 */
public class DemoCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "实现Callable";
    }
}
