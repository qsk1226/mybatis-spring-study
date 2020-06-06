package com.goddess.knowledge.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户 gamer
 * 
 * @author qinshengke
 * 2020-06-06
 */
@Data
public class Gamer implements Serializable {
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
     * gamer
     */
    private static final long serialVersionUID = 1L;
}