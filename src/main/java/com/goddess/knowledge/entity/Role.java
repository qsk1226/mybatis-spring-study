package com.goddess.knowledge.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * t_role
 * 
 * @author qinshengke
 * 2020-05-23
 */
@Data
public class Role implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注
     */
    private String note;

    /**
     * t_role
     */
    private static final long serialVersionUID = 1L;
}