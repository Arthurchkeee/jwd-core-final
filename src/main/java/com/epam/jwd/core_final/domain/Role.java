package com.epam.jwd.core_final.domain;

import com.epam.jwd.core_final.exception.UnknownEntityException;

public enum Role implements BaseEntity {
    MISSION_SPECIALIST(1L),
    FLIGHT_ENGINEER(2L),
    PILOT(3L),
    COMMANDER(4L);

    private final Long id;

    Role(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    /**
     * todo via java.lang.enum methods!
     */
    @Override
    public String getName() {
        return this.name();
    }

    /**
     * todo via java.lang.enum methods!
     * @throws UnknownEntityException if such id does not exist
     */
    public static Role resolveRoleById(int id) {

        Role role;
        switch(id){
            case (int) 1L:{
                role=MISSION_SPECIALIST;
                break;
            }
            case (int)2L:{
                role=FLIGHT_ENGINEER;
                break;
            }
            case (int)3L:{
                role=PILOT;
                break;
            }
            case (int)4L:{
                role=COMMANDER;
                break;
            } default: {
                UnknownEntityException unknownEntityException=new UnknownEntityException("Role");
                unknownEntityException.getMessage();
                throw unknownEntityException;
            }
        }
        return role;
    }
}
