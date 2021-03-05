package com.epam.jwd.core_final.criteria;

import com.epam.jwd.core_final.domain.BaseEntity;

import java.util.List;


/**
 * Should be a builder for {@link BaseEntity} fields
 */
public abstract class Criteria<T extends BaseEntity> {
    public List<T> meetCriteria(List<T> baseEntity) {
        return null;
    }

    void reset(){

    }

    void setID(Long id){
    }

    void setName(String name){
    }


}
