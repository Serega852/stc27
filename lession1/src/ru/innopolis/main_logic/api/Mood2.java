package ru.innopolis.main_logic.api;

public enum Mood2 {
    ANGRY(">:(", 42),
    SAD(":-(", 42),
    JOYFUL(":-)", 42),
    HAPPY(":-D", 42);

    private final String sleepy;
    private final Integer fortyTwo;

    public String getSleepy() {
        return sleepy;
    }

    public Integer getFortyTwo() {
        return fortyTwo;
    }

    public String getName() {
        return name().toLowerCase();
    }

    Mood2(String sleepy, Integer fortyTwo) {
        this.sleepy = sleepy;
        this.fortyTwo = fortyTwo;
    }
}
