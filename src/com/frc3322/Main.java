package com.frc3322;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ChocolateChipCookie cookie = new ChocolateChipCookie();

        ArrayList<Cookie>  cookieJar = new ArrayList<>();

        cookieJar.add(new ChocolateChipCookie());
        cookieJar.add(new Molasses());
        cookieJar.add(new Sugar(true));
        cookieJar.add(new Oatmeal());
        cookieJar.add(new PeanutButter());

        Human charlie = new Human("Charlie", true);

        charlie.eats(cookieJar);

        System.out.printf("%s ate %d cookies containing %d calories",
                charlie.getName(), cookieJar.size(), charlie.ateCalories());

        if (charlie.isSick())
           System.out.printf("%s is sick", charlie.getName());
    }
}
