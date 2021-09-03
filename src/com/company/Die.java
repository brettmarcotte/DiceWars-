package com.company;

public class Die {

    private final int sides;
    private int value;

    public Die(int sides) {
        this.sides = sides;
        this.value = 0;
    }

    public void rollDie() {
        value = (int) (Math.random() * sides + 1);
//        System.out.println("ANd your number is " + val);
    }

    public int getValue() {
        return value;
    }
}
