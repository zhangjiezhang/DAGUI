package xyz.pascall.lambd;

public interface LambdDemo {
    void run();

    default void print() {
        System.err.println("lambd 表达式");
    }
}
