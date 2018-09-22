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
}
