package com.example.devendratadiyal.recyclerview;

/**
 * Created by Devendra Tadiyal on 2/6/2018.
 */

public class Getter {

    public String getHeading() {
        return heading;
    }

    public String getBanner() {
        return banner;
    }



    private String heading;
    private String banner;

    public Getter(String heading, String banner) {
        this.heading = heading;
        this.banner = banner;
    }
}
