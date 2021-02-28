package com.epam.jwd.core_final.domain;

import com.epam.jwd.core_final.exception.UnknownEntityException;

public enum Rank implements BaseEntity {
    TRAINEE(1L),
    SECOND_OFFICER(2L),
    FIRST_OFFICER(3L),
    CAPTAIN(4L);

    private final Long id;

    Rank(Long id) {
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
     *
     * @throws UnknownEntityException if such id does not exist
     */
    public static Rank resolveRankById(int id) throws UnknownEntityException {
        Rank rank;
        switch (id){
            case (int) 1L:{
                rank=TRAINEE;
                break;
            }
            case (int)2L:{
                rank=SECOND_OFFICER;
                break;
            }
            case (int)3L:{
                rank=FIRST_OFFICER;
                break;
            }
            case (int)4L:{
                rank=CAPTAIN;
                break;
            } default:{
                UnknownEntityException unknownEntityException=new UnknownEntityException("Rank");
                unknownEntityException.getMessage();
                throw unknownEntityException;
            }
        }
        return rank;
    }
}
