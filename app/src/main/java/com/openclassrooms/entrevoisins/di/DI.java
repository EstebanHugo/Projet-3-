package com.openclassrooms.entrevoisins.di;

import com.openclassrooms.entrevoisins.service.DummyNeighbourApiService;
import com.openclassrooms.entrevoisins.service.FavoryNeighbourApiService;
import com.openclassrooms.entrevoisins.service.FavoryNeighbourApiServiceImplementation;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;

/**
 * Dependency injector to get instance of services
 */
public class DI {

    private static NeighbourApiService service = new DummyNeighbourApiService();
    private static FavoryNeighbourApiService favoryservice = new FavoryNeighbourApiServiceImplementation();

    /**
     * Get an instance on @{@link NeighbourApiService}
     *
     * @return
     */
    public static NeighbourApiService getNeighbourApiService() {
        return service;
    }

    public static FavoryNeighbourApiService getFavoryNeighbourApiService() { return favoryservice;
    }

    /**
     * Get always a new instance on @{@link NeighbourApiService}. Useful for tests, so we ensure the context is clean.
     *
     * @return
     */
    public static NeighbourApiService getNewInstanceApiService() {
        return new DummyNeighbourApiService();
    }

    public static FavoryNeighbourApiServiceImplementation getFavoryNewInstanceApiService() {
        return new FavoryNeighbourApiServiceImplementation();
    }
}
