package com.epam.jwd.core_final.domain;


/**
 * Expected fields:
 * <p>
 * location could be a simple class Point with 2 coordinates
 */
public class Planet extends AbstractBaseEntity{
    Integer x;
    Integer y;

    public Planet(Long id,String name,Integer x,Integer y)
    {
        super(id, name);
        this.x=x;
        this.y=y;
    }
}
