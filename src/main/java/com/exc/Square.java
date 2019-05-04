package com.exc;

import java.util.ArrayList;

/**
 * Created by aaron on 5/3/2019.
 */
public class Square {
    final private int SIZE = 10;
    private ArrayList<Tile> square;

    public Square(){
        square = new ArrayList<Tile>(SIZE * SIZE);
    }


    public Tile getTile(int x, int y) {
        int location = x + SIZE * y;
        if( this.square.get(location) == null ) {
            this.square.add(location, Tile.RandomTile());
        }

        return this.square.get(location);
    }

    public static Square RandomSquare() {
        return new Square();
    }

}
