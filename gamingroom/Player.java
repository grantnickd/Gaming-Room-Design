package com.gamingroom;

/**
 * A simple class to hold information about a player
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 */
public class Player extends Entity {

    /**
     * Constructor with an identifier and name
     * 
     * @param id the unique identifier of the player
     * @param name the name of the player
     */
    public Player(long id, String name) {
        super(id, name); // Initialize id and name in the base class (Entity)
    }

    @Override
    public String toString() {
        return "Player [id=" + getId() + ", name=" + getName() + "]";
    }
}
