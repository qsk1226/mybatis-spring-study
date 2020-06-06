package com.goddess.knowledge.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 角色 game_hero
 * 
 * @author qinshengke
 * 2020-06-06
 */
@Data
public class GameHero implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 角色姓名
     */
    private String characterName;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 所属gamer id
     */
    private Long gamerId;

    /**
     * 种族id
     */
    private Long raceId;

    /**
     * 职业id
     */
    private Long occupationId;

    /**
     * game_hero
     */
    private static final long serialVersionUID = 1L;
}