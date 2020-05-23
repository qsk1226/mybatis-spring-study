package com.goddess.knowledge.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户角色关联 t_hero_role
 * 
 * @author qinshengke
 * 2020-05-23
 */
@Data
public class HeroRole implements Serializable {
    /**
     * 
     */
    private Integer roleId;

    /**
     * 
     */
    private Long userId;

    /**
     * t_hero_role
     */
    private static final long serialVersionUID = 1L;
}