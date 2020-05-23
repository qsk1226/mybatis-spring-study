package com.goddess.knowledge.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * t_hero
 * 
 * @author qinshengke
 * 2020-05-23
 */
@Data
@ToString
public class Hero implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 真实名称
     */
    private String realName;

    /**
     * 姓名
     */
    private Byte sex;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 备注
     */
    private String note;

    /**
     * 地址
     */
    private String address;

    /**
     * t_hero
     */
    private static final long serialVersionUID = 1L;
}