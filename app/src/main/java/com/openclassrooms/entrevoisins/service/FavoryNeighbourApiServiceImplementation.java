package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy mock for the Api
 */
public class FavoryNeighbourApiServiceImplementation implements  FavoryNeighbourApiService {

    private List<Neighbour> neighbours = new ArrayList<>();


    /**
     * {@inheritDoc}
     */
    @Override
    public List<Neighbour> getNeighbours() {
        return neighbours;
    }

    @Override
    public void removefavorite(Neighbour neighbour) {

        neighbours.remove(neighbour);

    }

    @Override
    public void addfavorite(Neighbour neighbour) {


        neighbours.add(neighbour);

    }

    @Override
    public boolean isfav(Neighbour neighbour) {
        return neighbours.contains(neighbour);
    }
}
