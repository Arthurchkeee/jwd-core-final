package com.epam.jwd.core_final.factory.impl;

import com.epam.jwd.core_final.domain.Planet;
import com.epam.jwd.core_final.factory.EntityFactory;

public class PlanetFactory implements EntityFactory<Planet> {
    public static final PlanetFactory INSTANCE=new PlanetFactory();
    private PlanetFactory(){};
    @Override
    public Planet create(Object... args) {
        return new Planet((Long) args[0],(String) args[1],(Integer) args[2],(Integer) args[3]);
    }
}
