package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.List;


/**
 * Neighbour API client
 */
public interface FavoryNeighbourApiService {

    /**
     * Get all my Neighbours
     * @return {@link List}
     */
    List<Neighbour> getNeighbours();

    /**
     * Deletes a neighbour
     * @param neighbour
     */
    void removefavorite(Neighbour neighbour);

    /**
     * Create a neighbour
     * @param neighbour
     */
    void addfavorite(Neighbour neighbour);

    boolean isfav(Neighbour neighbour);
}
