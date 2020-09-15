package ru.innopolis.thr;

import java.text.MessageFormat;

public class MultiThread implements Runnable {
    private final String name;
    private final Object monitor = new Object();

    MultiThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                synchronized (monitor) {
                    System.out.println(String.format("name=%s cnt=%d", name, i));
                }
            }
        }
    }
}
