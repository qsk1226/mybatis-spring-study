package com.goddess.knowledge.mapper;

import com.goddess.knowledge.entity.HeroRole;
import com.goddess.knowledge.entity.example.HeroRoleCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户角色关联
 * 
 * @author qinshengke
 * 2020-05-23
 */
public interface HeroRoleMapper {
    /**
     * 根据指定的条件获取数据库记录数
     *
     * @param condition HeroRoleCondition
     * 
     * @return long 记录数
     */
    long countByExample(HeroRoleCondition condition);

    /**
     * 根据指定的条件删除数据库符合条件的记录
     *
     * @param condition HeroRoleCondition
     * 
     * @return int 影响行数
     */
    int deleteByExample(HeroRoleCondition condition);

    /**
     * 根据主键删除数据库的记录
     *
     * @param roleId Integer
     * @param userId Long
     * 
     * @return int 影响行数
     */
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("userId") Long userId);

    /**
     * 新写入数据库记录
     *
     * @param record HeroRole
     * 
     * @return int 影响行数
     */
    int insert(HeroRole record);

    /**
     * 动态字段,写入数据库记录
     *
     * @param record HeroRole
     * 
     * @return int 影响行数
     */
    int insertSelective(HeroRole record);

    /**
     * 根据指定的条件查询符合条件的数据库记录
     *
     * @param condition HeroRoleCondition
     * 
     * @return List<HeroRole>
     */
    List<HeroRole> selectByExample(HeroRoleCondition condition);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录
     *
     * @param record HeroRole
     * @param condition HeroRoleCondition
     * 
     * @return int 影响行数
     */
    int updateByExampleSelective(@Param("record") HeroRole record, @Param("example") HeroRoleCondition condition);

    /**
     * 根据指定的条件来更新符合条件的数据库记录
     *
     * @param record HeroRole
     * @param condition HeroRoleCondition
     * 
     * @return int 影响行数
     */
    int updateByExample(@Param("record") HeroRole record, @Param("example") HeroRoleCondition condition);
}