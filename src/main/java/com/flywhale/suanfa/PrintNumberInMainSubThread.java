package com.flywhale.suanfa;

import java.util.function.IntConsumer;

/**
 * 我们希望你通过开启线程的方式来实现。
 * 你所需要编写的代码是一个叫做 run_print_in_thread 的方法（Java/C++ 中是 runPrintInThread），
 * 其中要求你不能在主线程进行打印操作，所以你需要开启一个新的线程，调用 print_hello_world（在 C++ 中是 printHelloWorld 方法） 方法打印 hello word
 * （在 Java 中你需要新建一个线程，通过 print 的 accept 返回任意数值）来完成该操作。
 */
public class PrintNumberInMainSubThread {

    public static void printNumberInMainSubThread(){
        new Thread(() -> {
            System.out.println("hello word");
        }).start();
    }

    public static void printHelloWorld(IntConsumer print){
        new Thread(() -> {
            System.out.println("hello word");
            print.accept(1);
        }).start();
    }

    public static void main(String[] args) {
        PrintNumberInMainSubThread.printNumberInMainSubThread();
    }

}
