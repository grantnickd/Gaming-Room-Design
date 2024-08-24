package com.gamingroom;

/**
 * A base class to hold common information about game entities
 */
public class Entity {
    
    // Private fields
    private long id;
    private String name;

    /**
     * Default constructor
     */
    protected Entity() {
        // Default constructor
    }

    /**
     * Constructor with an identifier and name
     * 
     * @param id the unique identifier of the entity
     * @param name the name of the entity
     */
    protected Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
    }
}
