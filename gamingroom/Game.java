package com.gamingroom;

/**
 * A class representing a game in the system.
 * This class contains an identifier and name for each game.
 */
public class Game extends Entity {

    /**
     * Constructor with an identifier and name.
     * 
     * @param id the unique identifier of the game
     * @param name the name of the game
     */
    public Game(long id, String name) {
        super(id, name); // Initialize id and name in the base class (Entity)
    }

    @Override
    public String toString() {
        return "Game [id=" + getId() + ", name=" + getName() + "]";
    }
}
