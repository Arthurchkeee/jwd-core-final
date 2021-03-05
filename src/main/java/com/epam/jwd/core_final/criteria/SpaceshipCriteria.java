package com.epam.jwd.core_final.criteria;

import com.epam.jwd.core_final.domain.BaseEntity;
import com.epam.jwd.core_final.domain.Role;
import com.epam.jwd.core_final.domain.Spaceship;

import java.util.Map;

/**
 * Should be a builder for {@link Spaceship} fields
 */
public class SpaceshipCriteria extends Criteria<Spaceship> {
    Spaceship spaceship;
    @Override
    void reset() {
        spaceship=null;
    }

    @Override
    void setID(Long id) {
        super.setID(id);
    }

    @Override
    void setName(String name) {
        super.setName(name);
    }

    void setFlightDistance(Long flightDistance){
        spaceship.setFlightDistance(flightDistance);
    }

    void setCrew(Map<Role, Short> crew){
        spaceship.setCrew(crew);
    }
}
