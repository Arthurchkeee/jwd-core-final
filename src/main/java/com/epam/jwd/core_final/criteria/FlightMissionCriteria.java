package com.epam.jwd.core_final.criteria;

import com.epam.jwd.core_final.domain.*;

import java.time.LocalDate;
import java.util.List;

/**
 * Should be a builder for {@link com.epam.jwd.core_final.domain.FlightMission} fields
 */
public class FlightMissionCriteria extends Criteria<FlightMission> {
    FlightMission flightMission;

    @Override
    void setName(String name) {
        super.setName(name);
    }

    @Override
    void reset() {
        flightMission=null;
    }

    @Override
    void setID(Long id) {
        super.setID(id);
    }
    void setMissionName(String missionName){
        flightMission.setMissionName(missionName);
    }
    void setStartDate(LocalDate startDate){
        flightMission.setStartDate(startDate);
    }
    void setEndDate(LocalDate endDate){
        flightMission.setEndDate(endDate);
    }
    void setDistance(Long distance){
        flightMission.setDistance(distance);
    }
    void setAssignedSpaceShift(Spaceship assignedSpaceShift){
        flightMission.setAssignedSpaceShift(assignedSpaceShift);
    }
    void setAssignedCrew(List<CrewMember> assignedCrew){
        flightMission.setAssignedCrew(assignedCrew);
    }
    void setMissionResult(MissionResult missionResult){
        flightMission.setMissionResult(missionResult);
    }
    void setFrom(Planet from){
        flightMission.setFrom(from);
    }
    void setTo(Planet to){
        flightMission.setTo(to);
    }
}
