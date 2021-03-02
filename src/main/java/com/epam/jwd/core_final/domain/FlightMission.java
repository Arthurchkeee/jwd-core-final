package com.epam.jwd.core_final.domain;

import java.time.LocalDate;
import java.util.List;

/**
 * Expected fields:
 * <p>
 * missions name {@link String}
 * start date {@link java.time.LocalDate}
 * end date {@link java.time.LocalDate}
 * distance {@link Long} - missions distance
 * assignedSpaceShift {@link Spaceship} - not defined by default
 * assignedCrew {@link java.util.List<CrewMember>} - list of missions members based on ship capacity - not defined by default
 * missionResult {@link MissionResult}
 * from {@link Planet}
 * to {@link Planet}
 */
public class FlightMission extends AbstractBaseEntity {
    String missionName;
    LocalDate startDate;
    LocalDate endDate;
    Long distance;
    Spaceship assignedSpaceShift;
    List<CrewMember> assignedCrew;
    MissionResult missionResult;
    Planet from;
    Planet to;
    public FlightMission(Long id,String name,String missionName,LocalDate startDate,LocalDate endDate,Long distance,Spaceship assignedSpaceShift,
                         List<CrewMember> assignedCrew, MissionResult missionResult, Planet from, Planet to) {
        super(id, name);
        this.assignedCrew=assignedCrew;
        this.assignedSpaceShift=assignedSpaceShift;
        this.distance=distance;
        this.missionName=missionName;
        this.endDate=endDate;
        this.startDate=startDate;
        this.from=from;
        this.to=to;
        this.missionResult=missionResult;
    }
    // todo

}
