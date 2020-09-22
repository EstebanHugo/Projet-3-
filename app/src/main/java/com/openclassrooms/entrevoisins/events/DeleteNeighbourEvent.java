package com.openclassrooms.entrevoisins.events;

import com.openclassrooms.entrevoisins.model.Neighbour;

/**
 * Event fired when a user deletes a Neighbour
 */
public class DeleteNeighbourEvent {

    /**
     * Neighbour to delete
     */
    public Neighbour neighbour;
    public boolean favory;

    public DeleteNeighbourEvent(Neighbour neighbour, boolean favory) {
        this.neighbour = neighbour;
        this.favory = favory;
    }



}
