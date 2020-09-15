package ru.innopolis.thr.store;

public class Store {
    private static final int MAX_OPERATION = 3;
    private int goods = 0;

    public synchronized void fillGoods() {
        for (int i = 0; i < MAX_OPERATION; i++) {
            System.out.println("Пополняем: " + ++goods);
        }
        this.notify();
    }

    public synchronized void sellGoods() {
        try {
            this.wait();
            for (int i = 0; i < MAX_OPERATION; i++) {
                System.out.println("Осталось:" + --goods);
            }
        } catch (InterruptedException e) {
            System.out.println("wait прерван: " + e.getMessage());
        }
    }
}
