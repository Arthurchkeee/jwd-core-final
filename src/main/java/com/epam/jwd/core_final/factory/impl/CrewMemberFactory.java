package com.epam.jwd.core_final.factory.impl;

import com.epam.jwd.core_final.domain.CrewMember;
import com.epam.jwd.core_final.domain.Rank;
import com.epam.jwd.core_final.domain.Role;
import com.epam.jwd.core_final.factory.EntityFactory;

// do the same for other entities
public class CrewMemberFactory implements EntityFactory<CrewMember> {
    public static final CrewMemberFactory INSTANCE=new CrewMemberFactory();
    private CrewMemberFactory(){};

    @Override
    public CrewMember create(Object... args) {
        return new CrewMember(Long.parseLong((String) args[0]),(Role) args[1],(String)args[2],(Rank) args[3]);
    }
}
