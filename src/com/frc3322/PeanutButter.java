package com.frc3322;

public class PeanutButter implements Cookie {

    private int calories = 100;
    private int amountOfCookieLeft = 1;

    @Override
    public int calories() {
        return 0;
    }

    @Override
    public void eat() {

    }

    @Override
    public int amount() {
        return 0;
    }

    @Override
    public boolean containsPeanuts() {
        return true;
    }
}
