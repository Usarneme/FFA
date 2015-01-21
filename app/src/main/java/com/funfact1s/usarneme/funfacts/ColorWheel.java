package com.funfact1s.usarneme.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by usarneme on 1/4/2015.
 */
public class ColorWheel {

    public String[] myColors = {
    "#39add1", "#3079ab", "#c25975", "#e15258", "#f9845b", "#838cc7", "#7d669e", "#53bbb4", "#51b46d", "#e0ab18", "#637a91", "#f092b0", "#b7c0c7"};

    public int getColor() {

        String theColor;

        Random randNum = new Random();
        int randomInt = randNum.nextInt(myColors.length);

        theColor = myColors[randomInt];
        int colorAsInt = Color.parseColor(theColor);
        return colorAsInt;
    }
}
