package com.epam.jwd.core_final.domain;

/**
 * Expected fields:
 * <p>
 * role {@link Role} - member role
 * rank {@link Rank} - member rank
 * isReadyForNextMissions {@link Boolean} - true by default. Set to false, after first failed mission
 */
public class CrewMember extends AbstractBaseEntity {
    private  Rank rank;
    private  Role role;
    private  Boolean isReadyForNextMissions=true;
    public CrewMember(Long id,Role role,String name,Rank rank) {
        super(id, name);
        this.role=role;
        this.rank=rank;
    }
    // todo


    public void setReadyForNextMissions(Boolean readyForNextMissions) {
        this.isReadyForNextMissions = readyForNextMissions;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Rank getRank() {
        return rank;
    }

    public Role getRole() {
        return role;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
