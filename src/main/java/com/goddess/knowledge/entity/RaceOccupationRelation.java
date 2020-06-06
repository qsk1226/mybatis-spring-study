package com.goddess.knowledge.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 种族职业 race_occupation_relation
 * 
 * @author qinshengke
 * 2020-06-06
 */
@Data
public class RaceOccupationRelation implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 种族id
     */
    private Long raceId;

    /**
     * 职业id
     */
    private Long occupationId;

    /**
     * 描述
     */
    private String position;

    /**
     * race_occupation_relation
     */
    private static final long serialVersionUID = 1L;
}