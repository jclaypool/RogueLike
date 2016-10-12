package com.example.jake.roguelike.control;

import java.util.ArrayList;

/**
 * Created by jake on 10/11/2016.
 */

public class MapBuilder {
    private ArrayList<ArrayList<Tile>> mapArray;
    private int mapHeight = Constants.HEIGHT;
    private int mapWidth = Constants.WIDTH;
    private int maxRoomSize = Constants.MAX_ROOM_SIZE;

    public MapBuilder(){}

    // builds a map - filling in the mapArray
    public void buildMap(){
        mapArray = new ArrayList<ArrayList<Tile>>(mapWidth);
        for (int x = 0;x< mapWidth;x++){
            mapArray.add(new ArrayList<Tile>(mapWidth));
        }

        // test the list
        mapArray.get(15).set(15, new Tile(15,15));

    }
}
