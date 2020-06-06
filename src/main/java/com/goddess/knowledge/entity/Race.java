package com.goddess.knowledge.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 种族 race
 * 
 * @author qinshengke
 * 2020-06-06
 */
@Data
public class Race implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 种族名称
     */
    private String raceName;

    /**
     * race
     */
    private static final long serialVersionUID = 1L;
}