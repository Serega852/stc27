package ru.innopolis.main_logic.imp;

import ru.innopolis.main_logic.api.Example;
import ru.innopolis.main_logic.api.Mood2;

public class ExampleImpl implements Example {

    @Override
    public String giveExample(Mood2 mood2) {
        switch (mood2) {
            case ANGRY:
            case SAD:
                return "(((((";
            case JOYFUL:
            case HAPPY:
                return "))))";
            default:
                System.out.println("Что за эм??!");
                return null;
        }
    }
}
