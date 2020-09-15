package ru.innopolis.main_logic.imp;

import ru.innopolis.main_logic.api.Example;
import ru.innopolis.main_logic.api.Mood2;

public abstract class HappyExample implements Example {
    abstract int getHappyPower(String bracket);

    public void happyPrint() {
        final String happy = giveExample(Mood2.HAPPY);
        System.out.println("power=" + getHappyPower(happy));
    }
}
