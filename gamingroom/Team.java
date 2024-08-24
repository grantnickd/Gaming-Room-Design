package com.gamingroom;

/**
 * A simple class to hold information about a team
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 */
public class Team extends Entity {

    /**
     * Constructor with an identifier and name
     * 
     * @param id the unique identifier of the team
     * @param name the name of the team
     */
    public Team(long id, String name) {
        super(id, name); // Initialize id and name in the base class (Entity)
    }

    @Override
    public String toString() {
        return "Team [id=" + getId() + ", name=" + getName() + "]";
    }
}
