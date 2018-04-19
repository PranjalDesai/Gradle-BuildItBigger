package com.pranjaldesai.javajokes;

import java.util.Random;

public class javaJokes {

    // Jokes array
    String myJoke[]= {
        "Did you hear about the love affair between sugar and cream?  It was icing on the cake.",
        "Why are iPhone chargers not called Apple Juice?!",
        "I had my credit card stolen the other day but I didn’t bother to report it because the thief spends less than my wife.",
        "Always borrow money from a pessimist. He won’t expect it back.",
        "Retirement is the time in your life when time is no longer money."
    };

    public javaJokes(){
        super();
    }

    // returns random jokes from the array
    public String getMyJoke() {
        Random random= new Random();
        String joke= myJoke[random.nextInt(myJoke.length)];
        return joke;
    }
}
