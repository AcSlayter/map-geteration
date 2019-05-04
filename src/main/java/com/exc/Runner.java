package com.exc;

/**
 * Created by aaron on 5/3/2019.
 */
@SuppressWarnings("ALL")
public class Runner {
    public static boolean main (String[] args) {
        System.out.println(String.join(", ", args));
        Map map = new Map();

        Square cord = map.getCord(new Cord(0, 0));
        Tile tile = cord.getTile(0, 0);
        System.out.print( "Color : " + tile.getType() );
        return true;
    }
}
