package ru.innopolis.main;

import java.io.IOException;

public class MyExp extends IOException {
    public MyExp(String message) {
        super(message);
    }

    private class MyE extends MyExp {
        public MyE(String message) {
            super(message);
        }
    }
}
