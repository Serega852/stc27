package ru.innopolis.generic;

import java.util.Random;

public final class Pojo {
    private final int a;
    private final int b;

    public Pojo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public int hashCode() {
        return new Random().nextInt();
    }

    @Override
    public boolean equals(Object obj) {
        return ((Pojo) obj).getA() == this.getA() &&
                ((Pojo) obj).getB() == this.getB();
    }
}
