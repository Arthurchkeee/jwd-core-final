package com.epam.jwd.core_final.service.impl;

import com.epam.jwd.core_final.criteria.Criteria;
import com.epam.jwd.core_final.domain.ApplicationProperties;
import com.epam.jwd.core_final.domain.CrewMember;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class CrewService implements com.epam.jwd.core_final.service.CrewService {
    public static final CrewService INSTANCE=new CrewService();
    private CrewService(){};

    @Override
    public List<CrewMember> findAllCrewMembers() throws IOException {
        List<String> crew= (List<String>) Files.lines(Path.of(new ApplicationProperties().getInputRootDir() + new ApplicationProperties().getCrewFileName()));
        crew.stream()
                .filter(a-> a.endsWith(";"))
                .forEach(System.out::println);
        return null;
    }

    @Override
    public List<CrewMember> findAllCrewMembersByCriteria(Criteria<? extends CrewMember> criteria) {
        return null;
    }

    @Override
    public Optional<CrewMember> findCrewMemberByCriteria(Criteria<? extends CrewMember> criteria) {
        return Optional.empty();
    }

    @Override
    public CrewMember updateCrewMemberDetails(CrewMember crewMember) {

        return crewMember;
    }

    @Override
    public void assignCrewMemberOnMission(CrewMember crewMember) throws RuntimeException {

    }

    @Override
    public CrewMember createCrewMember(CrewMember spaceship) throws RuntimeException {
        return new CrewMember(spaceship.getId(),spaceship.getRole(),spaceship.getName(),spaceship.getRank());
    }
}
