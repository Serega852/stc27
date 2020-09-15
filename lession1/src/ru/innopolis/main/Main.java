package ru.innopolis.main;

import org.junit.Test;
import ru.innopolis.main_logic.api.Example;
import ru.innopolis.main_logic.api.Mood2;
import ru.innopolis.main_logic.imp.HappyCounter;
import ru.innopolis.main_logic.imp.HappyExample;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        run();
    }

    @Test
    private static void run() {
        final Example example = new Example() {
            int a = 25;
            final int b = 42;
            static final int c = 64;
            @Override
            public String giveExample(Mood2 mood2) {
                return "const";
            }
        };
        final String s = example.giveExample(null);
        System.out.println(s);
    }
}
