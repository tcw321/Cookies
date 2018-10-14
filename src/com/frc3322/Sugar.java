package com.frc3322;

public class Sugar implements Cookie {

    private boolean frostingFlag;
    private int calories = 100;
    private int amountOfCookieLeft = 1;

    public Sugar(boolean frostingFlag)
    {
        this.frostingFlag = frostingFlag;
    }
    @Override
    public int calories() {
        if (frostingFlag)
            return calories + 20;
        return calories;
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
        return false;
    }
}
