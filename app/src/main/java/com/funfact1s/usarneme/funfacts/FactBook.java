package com.funfact1s.usarneme.funfacts;

import java.util.Random;

/**
 * Created by usarneme on 1/4/2015.
 */
public class FactBook {
    // member variables: properties about the object

    // methods: what the object can do
    public String getFact() {
        String[] mFacts = {
                "Ants stretch when they wake up in the morning.",
                "Ostriches can run faster than horses.",
                "Olympic gold medals are actually made mostly of silver.",
                "You are born with 300 bones; by the time you are an adult you will have 206.",
                "It takes about 8 minutes for light from the Sun to reach Earth.",
                "Some bamboo plants can grow almost a meter in just one day.",
                "The state of Florida is bigger than England.",
                "Some penguins can leap 2-3 meters out of the water.",
                "On average, it takes 66 days to form a new habit.",
                "Mammoths still walked the earth when the Great Pyramid was being built.",
                "The Appalachian Mountains run from Maine to Alabama.",
                "Switzerland has the highest consumption of chocolate per capita.",
                "Alaska is the largest U.S. State.",
                "There are 54 colored squares on a standard Rubik's cube.",
                "A polar bear's skin is black.",
                "Isaac Asimov, who published many Sci-Fi novels about space, was afraid of heights and flying.",
                "Canberra is the capitol city of Australia.",
                "Mosquitos are most attracted to the color blue.",
                "U.S. President Rutherford B. Hayes was nicknamed 'His Fraudulency' after the disputed election of 1876.",
                "There is more Vitamin C in a sweet red pepper than in a Valencia orange.",
                "A female donkey is called a jenny."};

        // The Button was clicked so update the fact label with a new fact.

        // Randomly select a fact.
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        // Convert a random number to a text fact.
        String fact = mFacts[randomNumber];

        return fact;
    }
}
