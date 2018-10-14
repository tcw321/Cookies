package com.frc3322;

import java.util.ArrayList;

public class Human {

    private boolean peanutAllergyFlag;
    private int caloriesEaten;
    private boolean sickFlag = false;
    private String name;

    public Human(String name, boolean peanutAllergyFlag )
    {
        this.peanutAllergyFlag = peanutAllergyFlag;
        this.name = name;
    }

    public void eats(ArrayList<Cookie> cookies)
    {
        for(Cookie c : cookies)
        {
            caloriesEaten += c.calories();
            if (c.containsPeanuts())
                sickFlag = true;
        }
    }

    public boolean isSick()
    {
        return sickFlag;
    }

    public String getName()
    {
        return name;
    }

    public int ateCalories() {
        return caloriesEaten;
    }
}
