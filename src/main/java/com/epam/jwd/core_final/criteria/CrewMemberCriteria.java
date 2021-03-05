package com.epam.jwd.core_final.criteria;

import com.epam.jwd.core_final.domain.CrewMember;
import com.epam.jwd.core_final.domain.Rank;
import com.epam.jwd.core_final.domain.Role;

import java.util.List;

/**
 * Should be a builder for {@link com.epam.jwd.core_final.domain.CrewMember} fields
 */
public class CrewMemberCriteria extends Criteria<CrewMember> {
    public List<CrewMember> meetCriteria(List<CrewMember> crewMemberList) {
        return crewMemberList;
    }

    private CrewMember crewMember;

    @Override
    void reset() {
        crewMember=null;
    }

    @Override
    void setID(Long id) {
        super.setID(id);
    }

    @Override
    void setName(String name) {
        super.setName(name);
    }

    void setRank(Rank rank){
        crewMember.setRank(rank);
    }

    void setRole(Role role){
        crewMember.setRole(role);
    }
}
