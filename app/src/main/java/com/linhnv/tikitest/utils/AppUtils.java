package com.linhnv.tikitest.utils;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by linhnv on 22/09/2018.
 */

public class AppUtils {
    public static int getRandomColor(){
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        return color;
    }

    public static String getRandomColor(String prevColor) {

        String colors[] = {"#FEECE9", "#FEF6DE", "#ECFBFF", "#DEEAFD", "#F6E9F6"};

        boolean found = true;
        int r = 0;
        while (found) {
            r = new Random().nextInt(5);
            found = colors[r].equals(prevColor);
        }
        return colors[r];

    }
}
