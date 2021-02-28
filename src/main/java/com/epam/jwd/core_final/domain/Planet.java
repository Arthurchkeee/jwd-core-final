package com.epam.jwd.core_final.domain;

/**
 * Expected fields:
 * <p>
 * location could be a simple class Point with 2 coordinates
 */
public class Planet extends AbstractBaseEntity{

    public Planet(Long id,String name) {
        super(id, name);
    }
}
