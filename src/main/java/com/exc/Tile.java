package com.exc;

/**
 * Created by aaron on 5/3/2019.
 */
public class Tile {
    private String type;

    public Tile(String type) {
        this.type = type;
    }

    public Object getType() {
        return type;
    }

    public static Tile RandomTile() {
        return new Tile("GREEN");
    }
}
