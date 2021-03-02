package com.epam.jwd.core_final.factory.impl;

import com.epam.jwd.core_final.domain.Role;
import com.epam.jwd.core_final.domain.Spaceship;
import com.epam.jwd.core_final.factory.EntityFactory;

import java.util.Map;

public class SpaceshipFactory implements EntityFactory<Spaceship> {
    public static final SpaceshipFactory INSTANCE=new SpaceshipFactory();
    private SpaceshipFactory(){};
    @Override
    public Spaceship create(Object... args) {
        return new Spaceship((Long) args[0],(String) args[1],(Long) args[2],(Map<Role, Short>) args[3]);
    }
}
