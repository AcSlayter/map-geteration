package com.exc;

import java.util.HashMap;

/**
 * Created by aaron on 5/3/2019.
 */
public class Map {
    HashMap <Cord, Square> map;

    public Map() {
        this.map = new HashMap<Cord, Square>();
    }

    public Square getCord(Cord cord) {
        if(map.get(cord) == null) {
            map.put(cord,Square.RandomSquare());
        }
        return map.get(cord);
    }
}
