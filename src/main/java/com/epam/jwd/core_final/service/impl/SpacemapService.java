package com.epam.jwd.core_final.service.impl;

import com.epam.jwd.core_final.domain.Planet;

public class SpacemapService implements com.epam.jwd.core_final.service.SpacemapService {
    public static final SpacemapService INSTANCE=new SpacemapService();
    private SpacemapService(){};
    @Override
    public Planet getRandomPlanet() {
        return null;
    }

    @Override
    public int getDistanceBetweenPlanets(Planet first, Planet second) {

        return (int) Math.sqrt(Math.pow(first.getX()- second.getX(),2 )+Math.pow(first.getY()- second.getY(),2 ));
    }
}
