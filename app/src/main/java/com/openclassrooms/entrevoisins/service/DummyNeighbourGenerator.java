package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DummyNeighbourGenerator {

    public static List<Neighbour> DUMMY_NEIGHBOURS = Arrays.asList(
            new Neighbour(1, "Caroline", "https://nsa40.casimages.com/img/2020/09/07/200907033944202433.jpg", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/caroline"),
            new Neighbour(2, "Jack", "https://nsa40.casimages.com/img/2020/09/07/200907033659638531.jpg", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/jack"),
            new Neighbour(3, "Chloé", "https://nsa40.casimages.com/img/2020/09/07/200907034037468417.jpg", "Saint-Pierre-du-Mont ; 5km",

                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/Chloé"),
            new Neighbour(4, "Vincent", "https://nsa40.casimages.com/img/2020/09/07/200907034111877851.jpg", "Saint-Pierre-du-Mont ; 5km",

                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/vincent"),
            new Neighbour(5, "Elodie", "https://nsa40.casimages.com/img/2020/09/07/20090703435931217.jpg", "Saint-Pierre-du-Mont ; 5km",

                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/elodie"),
            new Neighbour(6, "Sylvain", "https://nsa40.casimages.com/img/2020/09/07/200907034430659615.jpg", "Saint-Pierre-du-Mont ; 5km",

                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/sylvain"),
            new Neighbour(7, "Laetitia", "https://nsa40.casimages.com/img/2020/09/07/200907034512816376.jpg", "Saint-Pierre-du-Mont ; 5km",

                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/laetitia"),
            new Neighbour(8, "Dan", "https://nsa40.casimages.com/img/2020/09/07/200907034610731033.jpg", "Saint-Pierre-du-Mont ; 5km",

                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/dan"),
            new Neighbour(9, "Joseph", "https://nsa40.casimages.com/img/2020/09/07/200907034713809354.jpg", "Saint-Pierre-du-Mont ; 5km",

                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/joseph"),
            new Neighbour(10, "Emma", "https://nsa40.casimages.com/img/2020/09/07/200907034946698698.jpg", "Saint-Pierre-du-Mont ; 5km",

                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/emma"),
            new Neighbour(11, "Patrick", "https://nsa40.casimages.com/img/2020/09/07/200907035903541534.jpg", "Saint-Pierre-du-Mont ; 5km",

                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/patrick"),
            new Neighbour(12, "Ludovic", "https://nsa40.casimages.com/img/2020/09/07/200907035110750731.jpg", "Saint-Pierre-du-Mont ; 5km",

                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                    "www.facebook.com/ludovic")
    );

    static List<Neighbour> generateNeighbours() {
        return new ArrayList<>(DUMMY_NEIGHBOURS);
    }
}
