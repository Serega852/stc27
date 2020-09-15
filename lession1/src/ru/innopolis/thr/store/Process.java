package ru.innopolis.thr.store;

public class Process {
    public static void main(String[] args) {
        final Store store = new Store();
        final Customer customer = new Customer(store);

        new Thread(customer).start();
        new Thread(new Filler(store)).start();
        new Thread(new Filler(store)).start();
        new Thread(new Filler(store)).start();
    }
}
