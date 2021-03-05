package com.epam.jwd.core_final.service.impl;

import com.epam.jwd.core_final.domain.Planet;

public class SpacemapService implements com.epam.jwd.core_final.service.SpacemapService {
    public static final SpacemapService INSTANCE=new SpacemapService();
    private SpacemapService(){};
    @Override
    public Planet getRandomPlanet() {
        String name = "";
        for (int i = 0; i < 7; i++) {
            int v = 1 + (int) (Math.random() * 26);
            char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
            name += c;
        }
        return new Planet((long)Math.random()*100,name,Integer.parseInt(String.valueOf(Math.random()*100)),
                Integer.parseInt(String.valueOf(Math.random()*100)));
    }

    @Override
    public int getDistanceBetweenPlanets(Planet first, Planet second) {

        return (int) Math.sqrt(Math.pow(first.getX()- second.getX(),2 )+Math.pow(first.getY()- second.getY(),2 ));
    }
}
