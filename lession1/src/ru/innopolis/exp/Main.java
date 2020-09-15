package ru.innopolis.exp;

import ru.innopolis.main_logic.api.Mood2;

import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        final Inner inner = new Inner(2, 5);
        System.out.println(inner.sum());
        work(inner);
        System.out.println(inner.sum());
    }

    private static void work(final Inner inner) {
//        inner = new Inner(100, 100);
        System.out.println("inner.sum() = " + inner.sum());
    }

    private static class Inner {
        int a;
        int b;

        public Inner(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int sum() {
            return a + b;
        }
    }
}
