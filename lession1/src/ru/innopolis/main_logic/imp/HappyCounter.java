package ru.innopolis.main_logic.imp;

import ru.innopolis.main_logic.api.Mood2;

import java.util.Objects;

public class HappyCounter extends HappyExample {
    private static int constructorCounter;
    private int happySize = 12;
    private Mood2 mood2 = Mood2.HAPPY;

    public HappyCounter() {
        constructorCounter++;
    }

    @Override
    int getHappyPower(String bracket) {
        int count = 0;
        for (char symbol : bracket.toCharArray()) {
            if (symbol == ')') {
                count++;
            }
        }
        return count;
    }

    @Override
    public String giveExample(Mood2 mood2) {
        System.out.println("mood2.getFortyTwo() = "
                + mood2.getFortyTwo());
        System.out.println(mood2.getSleepy());
        System.out.println(mood2.getName());
        switch (mood2) {
            case ANGRY:
            case SAD:
                return "";
            case JOYFUL:
                return ")))";
            case HAPPY:
                return ")))))))))";
            default:
                System.out.println("wtf?????!!!!!");
                return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof HappyExample) {
            System.out.println("WWWOOOW!!!!");
        }
        if (o == null || getClass() != o.getClass()) return false;
        HappyCounter that = (HappyCounter) o;
        return happySize == that.happySize &&
                mood2 == that.mood2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(happySize, mood2);
    }

    public static void printConstructorCounter() {
        System.out.println("constructorCounter = "
                + constructorCounter);
    }
}
