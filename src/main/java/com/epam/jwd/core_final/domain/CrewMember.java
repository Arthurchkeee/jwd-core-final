package com.epam.jwd.core_final.domain;

/**
 * Expected fields:
 * <p>
 * role {@link Role} - member role
 * rank {@link Rank} - member rank
 * isReadyForNextMissions {@link Boolean} - true by default. Set to false, after first failed mission
 */
public class CrewMember extends AbstractBaseEntity {
    private final Rank rank;
    private final Role role;
    private final Boolean isReadyForNextMissions=true;
    public CrewMember(Long id,String name,Rank rank,Role role) {
        super(id, name);
        this.role=role;
        this.rank=rank;
    }
    // todo
}
