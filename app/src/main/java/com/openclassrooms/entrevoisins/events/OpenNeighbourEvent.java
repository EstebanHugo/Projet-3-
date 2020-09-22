package com.openclassrooms.entrevoisins.events;

import com.openclassrooms.entrevoisins.model.Neighbour;

public class OpenNeighbourEvent {


    public Neighbour neighbour;
    public boolean favory;

    public OpenNeighbourEvent(Neighbour neighbour, boolean favory) {
        this.neighbour = neighbour;
        this.favory = favory;
    }






}
