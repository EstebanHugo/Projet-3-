package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FavoryNeighbourApiServiceImplementationTest {

    private FavoryNeighbourApiServiceImplementation favoryservice;

    @Before
    public void setup() {
        favoryservice = new FavoryNeighbourApiServiceImplementation();
    }


    @Test
    public void getNeighbours() {
        //given Je prépare mes données
        Neighbour hugo = new Neighbour(0, "a", "a", "a", "0", "a", "a");
        favoryservice.addfavorite(hugo);
        //when Je test mes méthodes
        List<Neighbour> neighbours = favoryservice.getNeighbours();
        //then je vérifie le résultat
        assert neighbours.contains(hugo);
    }

    @Test
    public void removefavorite() {
        //given Je prépare mes données
        Neighbour hugo = new Neighbour(0, "a", "a", "a", "0", "a", "a");
        Neighbour hug = new Neighbour(0, "a", "a", "a", "0", "a", "a");
        Neighbour hu = new Neighbour(0, "a", "a", "a", "0", "a", "a");
        favoryservice.addfavorite(hugo);
        favoryservice.addfavorite(hug);
        favoryservice.addfavorite(hu);
        //when Je test mes méthodes
        favoryservice.removefavorite(hu);
        //then je vérifie le résultat
        List<Neighbour> neighbours = favoryservice.getNeighbours();
        assertEquals(2, neighbours.size());
    }

    @Test
    public void addfavorite() {
        //given Je prépare mes données
        Neighbour hugo = new Neighbour(0, "a", "a", "a", "0", "a", "a");
        Neighbour hug = new Neighbour(1, "a", "a", "a", "0", "a", "a");
        Neighbour hu = new Neighbour(2, "a", "a", "a", "0", "a", "a");
        //when Je test mes méthodes
        favoryservice.addfavorite(hugo);
        favoryservice.addfavorite(hug);
        favoryservice.addfavorite(hu);
        //then je vérifie le résultat
        List<Neighbour> neighbours = favoryservice.getNeighbours();
        assertEquals(3, neighbours.size());

    }

    @Test
    public void isfav() {
        //given Je prépare mes données
        Neighbour hugo = new Neighbour(0, "a", "a", "a", "0", "a", "a");
        Neighbour hug = new Neighbour(1, "a", "a", "a", "0", "a", "a");
        Neighbour hu = new Neighbour(2, "a", "a", "a", "0", "a", "a");
        favoryservice.addfavorite(hug);
        favoryservice.addfavorite(hu);
        //when Je test mes méthodes
        boolean isfav = favoryservice.isfav(hugo);
        //then je vérifie le résultat
        assertFalse(isfav);

    }

    @Test
    public void isfavtrue() {
        //given Je prépare mes données
        Neighbour hugo = new Neighbour(0, "a", "a", "a", "0", "a", "a");
        Neighbour hug = new Neighbour(1, "a", "a", "a", "0", "a", "a");
        Neighbour hu = new Neighbour(2, "a", "a", "a", "0", "a", "a");
        favoryservice.addfavorite(hugo);
        favoryservice.addfavorite(hug);
        favoryservice.addfavorite(hu);
        //when Je test mes méthodes
        boolean isfav = favoryservice.isfav(hugo);
        //then je vérifie le résultat
        assertTrue(isfav);
    }
}