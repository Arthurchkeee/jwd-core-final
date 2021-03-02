package com.epam.jwd.core_final.factory.impl;

import com.epam.jwd.core_final.domain.*;
import com.epam.jwd.core_final.factory.EntityFactory;

import java.time.LocalDate;
import java.util.List;

public class FlightMissionFactory implements EntityFactory<FlightMission> {
    public final static FlightMissionFactory INSTANCE=new FlightMissionFactory();
    private FlightMissionFactory(){};
    @Override
    public FlightMission create(Object... args) {
        return new FlightMission((Long) args[0],(String) args[1],(String) args[2],(LocalDate) args[3],(LocalDate) args[4],(Long) args[5],
                (Spaceship) args[6],(List<CrewMember>) args[7],(MissionResult) args[8],(Planet) args[9],(Planet) args[10]);
    }
}
