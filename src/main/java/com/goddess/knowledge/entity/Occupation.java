package com.goddess.knowledge.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 职业 occupation
 * 
 * @author qinshengke
 * 2020-06-06
 */
@Data
public class Occupation implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 职业名称
     */
    private String occupationName;

    /**
     * occupation
     */
    private static final long serialVersionUID = 1L;
}